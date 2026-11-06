package com.smartParking.main;

import java.io.IOException;

import com.smartParking.model.Car;
import com.smartParking.model.ElectricCar;
import com.smartParking.model.ParkingSlot;
import com.smartParking.model.ParkingTicket;
import com.smartParking.model.Vehicle;
import com.smartParking.service.ParkingOperations;
import com.smartParking.service.ParkingServiceImpl;
import com.smartParking.utility.ParkingBackup;

public class ParkingApplication {

	public static void main(String[] args) {

		// Step 1: Create different vehicle objects

		Vehicle[] vehicles = {

				new Car("KA-01-AB-1111", "Riya", 20.0, "Petrol"),

				new ElectricCar("KA-05-EV-2024", "Aarav", 30.0, 8.0) };

		System.out.println("REGISTERED VEHICLES");

		for (Vehicle vehicle : vehicles) {
			vehicle.displayDetails();
		}

		// Step 2: Create parking slots

		ParkingSlot[] slots = {

				new ParkingSlot("P-01"),

				new ParkingSlot("P-02") };

		// Step 3: Use interface reference

		ParkingOperations parkingService = new ParkingServiceImpl();

		try {

			// Step 4: Create parking ticket

			ParkingTicket ticket = parkingService.createTicket(vehicles[1], slots, 3, 10, "PKT-1001");

			System.out.println("\nORIGINAL TICKET");

			System.out.println(ticket.createReceipt());

			// Step 5: Clone the ticket

			ParkingTicket clonedTicket = ticket.clone();

			System.out.println("\nClone created: " + clonedTicket.getTicketId());

			System.out.println(
					"Same Vehicle object in original and clone: " + (ticket.getVehicle() == clonedTicket.getVehicle()));

			// Step 6: Serialize the ticket

			String fileName = "parking-ticket.dat";

			ParkingBackup.saveTicket(ticket, fileName);

			System.out.println("Ticket serialized successfully.");

			// Step 7: Deserialize the ticket

			ParkingTicket restoredTicket = ParkingBackup.loadTicket(fileName);

			System.out.println("Ticket deserialized successfully.");

			System.out.println("\nRESTORED TICKET");

			System.out.println(restoredTicket.createReceipt());

		} catch (CloneNotSupportedException e) {

			System.out.println("Cloning failed: " + e.getMessage());

		} catch (IOException | ClassNotFoundException e) {

			System.out.println("Backup operation failed: " + e.getMessage());

		} catch (IllegalArgumentException | IllegalStateException e) {

			System.out.println("Parking operation failed: " + e.getMessage());
		}
	}
}
