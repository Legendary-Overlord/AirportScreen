package model;

import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

public class Flight implements Comparable, Comparator{

	private GregorianCalendar departureDate;
	private String airline;
	private int flightNumber;
	private String destiny;
	private int gate;
	public Flight(GregorianCalendar departureDate, String airline, int flightNumber, String destiny,
			int gate) {
		super();
		this.departureDate = departureDate;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.destiny = destiny;
		this.gate = gate;
	}
	public GregorianCalendar getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(GregorianCalendar departureDate) {
		this.departureDate = departureDate;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
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
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
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
