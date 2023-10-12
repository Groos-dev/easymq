package org.xin.easymq.netwerk;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;
import org.xin.easymq.netwerk.config.NettyServerConfig;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;


@Slf4j
public class RemotingServer {
    private ServerBootstrap bootstrap;
    private NettyServerConfig nettyServerConfig;
    public boolean start() throws InterruptedException {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workGroup);
        bootstrap.channel(NioServerSocketChannel.class);
        bootstrap.localAddress(new InetSocketAddress(nettyServerConfig.getPort()));
        bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
            }
        });
        ChannelFuture channelFuture = bootstrap.bind().sync();

        return true;
    }
}
