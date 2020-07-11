package me.blog.rookyhwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RookyhwanBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(RookyhwanBatchApplication.class, args);
	}

}
