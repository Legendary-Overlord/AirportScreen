package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class AirportScreen {

	List<Flight> flights;
	String[] airlines = {"Avianca", "Lufthansa", "American", "EasyJet","Bayerische Airlines","Emirates","Delta"};
	String[] destinies = {"Sao Pablo","Rio de Janeiro","Miami","Bogota","Washington","Moscow","Berlin","Munchen","Frankfurt","Madrid","Ibiza","Cancun","London"};
	public AirportScreen() {
		flights= new ArrayList<Flight>();
		
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
	
	
	//flightNumber sort by "Name"
	//Date objects has YYYY/MM/DD and HH:MM:SS capabilities(AM/PM)
	//Airline sort by name
	//destiny sort by name
	

	public void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
	
	public void selectionSort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
	
	public void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }
	
	
	
	
}
