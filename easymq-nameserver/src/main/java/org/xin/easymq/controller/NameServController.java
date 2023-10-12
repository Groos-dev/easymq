package org.xin.easymq.controller;

import org.xin.easymq.config.NameServConfig;
import org.xin.easymq.netwerk.RemotingServer;

public class NameServController {

    private RemotingServer remotingServer;
    private NameServConfig nameServConfig;

    public NameServController() {
    }

    /**
     *
     */
    protected void initialization() {
        this.nameServConfig = new NameServConfig();
        // default
        // TODO: 2023/10/11 determine if the configuration file exists
        // TODO: 2023/10/11 if exists parse the file and update is
        nameServConfig.load(null);
        remotingServer = new RemotingServer();

    }

    public boolean start() throws InterruptedException {
        return  remotingServer.start();
    }
}
