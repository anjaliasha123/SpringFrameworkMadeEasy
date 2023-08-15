package com.anjali.spring.jdbc.assignment1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anjali.spring.jdbc.assignment1.dao.PassengerDao;
import com.anjali.spring.jdbc.assignment1.dto.Passenger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/anjali/spring/jdbc/assignment1/passenger-config.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger(1, "Anamika","Stanly"));
        passengers.add(new Passenger(2, "Josh", "Tarun"));
        passengers.add(new Passenger(3, "Varun", "Karun"));
//        Inserting passenger
        for(Passenger p: passengers) {
        	int result = passengerDao.createPassenger(p);
        	if(result > 0) System.out.println("Successfully added passenger: "+p.getFirstName());
        }
//        Updating lastname of passenger with id 1
        int result1 = passengerDao.updatePassengerInfo(new Passenger(1, "Anamika","Kiku"));
        if(result1 > 0) System.out.println("Successfully updated passenger with id: 1");
//        deleting passenger with id 2
        int result2 = passengerDao.deletePassenger(2);
        if(result2 > 0) System.out.println("Successfully deleted passenger with id: 2");
        List<Passenger> list = passengerDao.getAllPassengers();
        for(Passenger p: list) {
        	System.out.println("id: "+p.getId()+" first name: "+p.getFirstName()+" last name: "+p.getLastName());
        }
    }
}
