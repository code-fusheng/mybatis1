package xyz.fusheng.mybatis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 通过扫包方式，将 MyBatis 相关对象交给 Spring 容器来管理。
@MapperScan("xyz.fusheng.mybatis1.repository")
public class Mybatis1Application {
    public static void main(String[] args) {
        SpringApplication.run(Mybatis1Application.class, args);
    }
}
