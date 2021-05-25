package pe.com.movistar.movclaimsconfigserverms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MovClaimsConfigserverMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovClaimsConfigserverMsApplication.class, args);
	}

}
