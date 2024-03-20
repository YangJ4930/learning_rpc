package com.yj.provider;
import com.yj.common.service.UserService;
import com.yj.rpc.registry.LocalRegistry;
import com.yj.rpc.server.HttpServer;
import com.yj.rpc.server.VertxHttpServer;

public class EasyProviderExample {

    public static void main(String[] args){
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 利用 ‘rpc’提供的vertx的server服务，绑定了8080端口
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
