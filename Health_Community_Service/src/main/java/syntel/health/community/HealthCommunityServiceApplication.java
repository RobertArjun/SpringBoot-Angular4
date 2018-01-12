package syntel.health.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("syntel.health.community.*")
public class HealthCommunityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCommunityServiceApplication.class, args);
	}
}
