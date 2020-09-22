package digytal.springdicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PropertiesApplication {
	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(FtpService bean) {
        return args -> {
        	bean.conectar();
        };
    }
}
