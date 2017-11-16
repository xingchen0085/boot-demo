package cn.xinge.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoJpaApplication.class, args);
        System.out.println("运行成功...");
    }
}
