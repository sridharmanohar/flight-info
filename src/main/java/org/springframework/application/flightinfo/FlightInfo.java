package org.springframework.application.flightinfo;

import com.fasterxml.jackson.annotation.JsonAlias;

public class FlightInfo {

	@JsonAlias("time")
	private String times;
	private String[][] states;

	public String getTimes() {
		return times;
	}

	public void setTimes(String time) {
		this.times = time;
	}

	public String[][] getStates() {
		return states;
	}

	public void setStates(String[][] states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return getTimes() + " " + getStates();
	}

}
