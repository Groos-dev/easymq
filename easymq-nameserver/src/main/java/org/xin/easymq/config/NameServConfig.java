package org.xin.easymq.config;


import lombok.Data;
import org.xin.easymq.netwerk.config.NettyServerConfig;

import java.util.Properties;

@Data
public class NameServConfig {

    private NettyServerConfig nettyServerConfig;
    private int port;
    public NameServConfig(){}

    public void load(Properties properties){
        // TODO: 2023/10/11 fill in basic configuration information
        nettyServerConfig = new NettyServerConfig();
    }

    private void loadNettyServerConfig(){
        // update nettyServerConfig
    }
}
