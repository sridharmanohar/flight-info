package org.springframework.application.flightinfo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class FlightController {

	/**
	 * Instead of RestTemplate you can also use ObjectMapper which is from the
	 * Jackson Databind package. RestTemplate is from the Spring Web Client package.
	 */
	@GetMapping("/")
	public String displayFlightInfo(Map<String, Object> model) {
		RestTemplate restTemplate = new RestTemplate();
		FlightInfo flightInfo = restTemplate.getForObject("https://opensky-network.org/api/states/all?icao24=e8027c",
				FlightInfo.class);
		String[][] temp = flightInfo.getStates();
		double alt = Math.round(Double.parseDouble(temp[0][7]) * 3.281);
		double velocity = Math.round(Double.parseDouble(temp[0][9]) * 3.6);
		temp[0][7] = String.valueOf(alt);
		temp[0][9] = String.valueOf(velocity);
		
		flightInfo.setStates(temp);
		model.put("flightInfo", flightInfo);
		return "displayFlightInfo";
	}

}
