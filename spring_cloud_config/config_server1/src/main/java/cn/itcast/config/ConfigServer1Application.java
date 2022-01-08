package cn.itcast.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer1Application.class,args);
    }

}
