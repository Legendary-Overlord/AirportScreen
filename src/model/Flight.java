package model;

import java.util.Comparator;

public class Flight implements Comparable, Comparator{

	private String departureDate;
	private String departureTime;
	private String airline;
	private String flightNumber;
	private String destiny;
	private int gate;
	public Flight(String departureDate, String departureTime, String airline, String flightNumber, String destiny,
			int gate) {
		super();
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.destiny = destiny;
		this.gate = gate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	public int getGate() {
		return gate;
	}
	public void setGate(int gate) {
		this.gate = gate;
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
