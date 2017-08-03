package ua.tascors.baseexitsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = "ua.tascors")
public class BaseExitsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseExitsApiApplication.class, args);
	}
}
