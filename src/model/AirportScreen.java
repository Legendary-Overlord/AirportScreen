package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class AirportScreen{

	List<Flight> flights;
	String[] airlines = {"Avianca", "Lufthansa", "American", "EasyJet","Bayerische","Emirates","Delta"};
	String[] destinies = {"Sao Pablo","Rio de Janeiro","Miami","Bogota","Washington","Moscow","Berlin","Munchen","Frankfurt","Madrid","Ibiza","Cancun","London"};
	public AirportScreen() {
		flights= new ArrayList<Flight>();
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public void generateRandomFlights(int numberOfFlights) {
		//when a new list is generated, the current one is deleted
		flights.clear();
		for (int i=0;i<numberOfFlights;i++){
			int month = randomNum(0,12);
			int day = randomNum(0,31);
			int hour = randomNum(0,24);
			int minute = randomNum(0,60);
			GregorianCalendar date = new GregorianCalendar(2019,month,day,hour,minute,0);
			int airline = randomNum(0,airlines.length);
			int destiny = randomNum(0,destinies.length);
			int gate = randomNum(1,30);
			flights.add(new Flight(date,airlines[airline],i,destinies[destiny],gate));
		}
	}
	public int randomNum(int inferiorLimit, int superiorLimit) {
		return (int) Math.floor(Math.random()*superiorLimit + inferiorLimit);
	}
	//bubble sort
	public void sortByHour() {
		//organize by hour
        int n = flights.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (flights.get(j).getDepartureDate().get(Calendar.HOUR_OF_DAY)>flights.get(j+1).getDepartureDate().get(Calendar.HOUR_OF_DAY))  { 
                    Flight temp = flights.get(j); 
                    flights.set(j, flights.get(j+1)); 
                    flights.set(j+1, temp); 
                } 
    } 
	//selection sort
	public void sortByGate() { 
        int n = flights.size(); 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (flights.get(j).getGate() < flights.get(min_idx).getGate()) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Flight temp = flights.get(min_idx);
            flights.set(min_idx, flights.get(i));
            flights.set(i, temp);
        } 
    }
	//insertion sort
	public void sortByFlightNum() { 
        int n = flights.size(); 
        for (int i = 1; i < n; ++i) { 
            Flight key = flights.get(i); 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && flights.get(j).getFlightNumber() > key.getFlightNumber()) { 
            	flights.set(j+1, flights.get(j));
                j = j - 1; 
            } 
            flights.set(j+1, key);
        } 
    }
	public void sortByAirline() { 
        int n = flights.size(); 
        for (int i = 1; i < n; ++i) { 
            Flight key = flights.get(i); 
            int j = i - 1; 
            while (j >= 0 && key.compareTo(flights.get(j))==-1) { 
            	flights.set(j+1, flights.get(j));
                j = j - 1; 
            } 
            flights.set(j+1, key);
        } 
    }
	public void sortByDestiny() { 
        int n = flights.size(); 
        for (int i = 1; i < n; ++i) { 
            Flight key = flights.get(i); 
            int j = i - 1; 
            while (j >= 0 && key.compare(key, flights.get(j))==-1) { 
            	flights.set(j+1, flights.get(j));
                j = j - 1; 
            } 
            flights.set(j+1, key);
        } 
    }
	public void sortByDate() { 
        int n = flights.size(); 
        for (int i = 1; i < n; ++i) { 
            Flight key = flights.get(i); 
            int j = i - 1; 
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && flights.get(j).getDepartureDate().getTime().after(key.getDepartureDate().getTime())) { 
            	flights.set(j+1, flights.get(j));
                j = j - 1; 
            } 
            flights.set(j+1, key);
        } 
    }
	//flight number binary search
	public int searchFlightNum(int x) { 
		sortByFlightNum();
        int l = 0, r = flights.size() - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (flights.get(m).getFlightNumber() == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (flights.get(m).getFlightNumber() < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    }
	//secuential search
	public int searchAirline(String air) {
		sortByAirline();
		int x=0;boolean loop=true;
		for (int i=0;i<flights.size()&&loop;i++) {
			if (flights.get(i).getAirline().equals(air)) {
				x=i;loop=false;
			}
		}
		return x;
	}
}
