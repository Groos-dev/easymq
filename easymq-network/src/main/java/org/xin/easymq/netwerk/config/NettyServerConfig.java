package org.xin.easymq.netwerk.config;

import lombok.Data;

@Data
public class NettyServerConfig {
  private int port = 7635;
  private int workerCount = 4;
  private int bossCount = 1;
}
