package application;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.AirportScreen;
import model.Flight;

public class ScreenInterfaceController {
	
	AirportScreen as;
	ObservableList<String> items;
	String titles;
	SimpleDateFormat date;
	
	public void initialize() {
		as = new AirportScreen();
		items = FXCollections.observableArrayList();
		date = new SimpleDateFormat("yyyy-MM-dd");
		titles = "Airline \t\t FL# \t\t Hour \t\t Date \t\t Destiny \t\t Gate";
		as.generateRandomFlights(20);
		updateItems();
	}

    @FXML
    private ListView<String> flightListView;

    @FXML
    void findFlight(ActionEvent event) {

    }

    @FXML
    void generate(ActionEvent event) {

    }

    @FXML
    void sortByAirline(ActionEvent event) {

    }

    @FXML
    void sortByDate(ActionEvent event) {

    }

    @FXML
    void sortByDestiny(ActionEvent event) {

    }

    @FXML
    void sortByFlightNumber(ActionEvent event) {

    }

    @FXML
    void sortByGate(ActionEvent event) {

    }

    @FXML
    void sortByHour(ActionEvent event) {

    }
    public void updateItems() {
    	items.clear();
    	items.add(titles);
    	for (int i=0;i<as.getFlights().size();i++) {
    		Flight fl = as.getFlights().get(i);
    		String flight = fl.getAirline()+" \t\t "+fl.getFlightNumber()+" \t\t "+fl.getDepartureDate().get(GregorianCalendar.HOUR)+fl.getDepartureDate().get(GregorianCalendar.AM_PM)
    				+" \t\t "+date.format(fl.getDepartureDate().getTime())+" \t\t "+fl.getDestiny()+" \t\t "+fl.getGate();
    		items.add(flight);
    	}
    	flightListView.setItems(items);
    }

}

