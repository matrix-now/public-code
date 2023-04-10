package io.sinsabridge.flowerbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "io.sinsabridge.flowerbackend.board.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
public class FlowerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowerBackendApplication.class, args);
    }

}
