package cn.lannis.demo.codegenerater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CodegeneraterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodegeneraterApplication.class, args);
    }

}
