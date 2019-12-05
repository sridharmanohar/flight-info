package org.springframework.application.flightinfo;

public class States {

	private String icao24;
	private String callsign;
	
	public States() {
		super();
	}
	public String getIcao24() {
		return icao24;
	}
	public void setIcao24(String icao24) {
		this.icao24 = icao24;
	}
	public String getCallsign() {
		return callsign;
	}
	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}
	
	@Override
	public String toString() {
		return getIcao24() + " " + getCallsign();
	}

	
	
}
