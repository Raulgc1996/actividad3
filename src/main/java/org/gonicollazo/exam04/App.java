package org.gonicollazo.exam04;

import java.sql.Date;

import org.gonicollazo.exam04.Dao.FlightDao;
import org.gonicollazo.exam04.models.Flight;
import org.gonicollazo.exam04.models.Passenger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Flight flight = new Flight("Flight1",null);
    	Passenger p1 = new Passenger("p1","897656789");
    	Passenger p2 = new Passenger("p1","897656789");
    	Passenger p3 = new Passenger("p1","897656789");
    	Passenger p4 = new Passenger("p1","897656789");
    	flight.addPass(p1);
    	flight.addPass(p2);
    	flight.addPass(p3);
    	flight.addPass(p4);
    	FlightDao dao = new FlightDao();
    	dao.insert(flight);
    	
    }
}
