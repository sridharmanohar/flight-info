package org.springframework.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightInfoMainApplication /* implements CommandLineRunner */ {

	public static void main(String[] args) {
		SpringApplication.run(FlightInfoMainApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		ObjectMapper objectMapper = new ObjectMapper();
//        FlightInfo flightInfo = objectMapper.readValue(new File("flightinfo.json"), FlightInfo.class);
//        System.out.println(flightInfo.getStates()[0][1]);		
//	}

}
