package spring.jsample;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}