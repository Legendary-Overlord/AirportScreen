package model;

import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

public class Flight implements Comparable<Flight>, Comparator<Flight>{

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
	//compare by destiny
	@Override
	public int compare(Flight fl1, Flight fl2) {
		return ((Integer.parseInt(fl1.getDestiny())<Integer.parseInt(fl2.getDestiny()))?-1:(Integer.parseInt(fl1.getDestiny())>Integer.parseInt(fl2.getDestiny()))?1:0);
	}
	//compare by airline
	@Override
	public int compareTo(Flight fl) {
		return (Integer.parseInt(airline)<Integer.parseInt(fl.getAirline()))?-1:(Integer.parseInt(airline)>Integer.parseInt(fl.getAirline()))?1:0;
	}

	
}
