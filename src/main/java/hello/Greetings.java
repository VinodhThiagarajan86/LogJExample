package hello;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Greetings {
	
	 static Logger myLogger = Logger.getLogger("myLogger");
			 
	@RequestMapping("/invite")
	public static String sayHello(){
		myLogger.debug("Testit debug");
		myLogger.info("Testit info");
		myLogger.warn("Testit warn");
		myLogger.error("Testit error");
		myLogger.fatal("Testit fatal");
		
		return "Hello , User";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(Greetings.class, args);
	}

}
