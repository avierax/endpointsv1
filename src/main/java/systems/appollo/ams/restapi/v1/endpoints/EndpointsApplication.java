package systems.appollo.ams.restapi.v1.endpoints;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import systems.appollo.ams.backend.domain.Project;

@SpringBootApplication
@EntityScan(basePackages = {"systems.appollo.ams.backend.domain", "systems.appollo.ams.backend.refactoring4.vcs.dbdriver"})
public class EndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProjectRepository repository) {
		return (args) -> {
			repository.findAll().forEach(System.out::println);
		};
	}


}
