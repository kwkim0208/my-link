package kr.com.mylink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kr.com.mylink.mapper")
public class ThymeleafCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafCrudApplication.class, args);
    }

}
