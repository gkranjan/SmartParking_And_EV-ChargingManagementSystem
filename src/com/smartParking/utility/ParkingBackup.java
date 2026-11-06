package com.smartParking.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.smartParking.model.ParkingTicket;

public class ParkingBackup {
	
	public static void saveTicket(ParkingTicket ticket,String fileName) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			output.writeObject(ticket);
		}
	}
	
	public static ParkingTicket loadTicket(String fileName) throws IOException,ClassNotFoundException
	{
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName)))
				{
					return(ParkingTicket) input.readObject();
				}
	}
	

}
