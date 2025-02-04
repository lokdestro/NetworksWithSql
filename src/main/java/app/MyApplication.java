package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)
public class MyApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(MyApplication.class, args);
    }
}
