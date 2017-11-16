package cn.myxinge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.myxinge.mapper")
public class BootDemoMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoMybatisApplication.class, args);
	}
}
