# 🚗 Smart Parking and EV Charging Management System

### A Java 8 Industry-Level Project

A Java-based Smart Parking and EV Charging Management System that simulates a real-world parking facility. The application manages different types of vehicles, allocates available parking slots, calculates parking and EV charging fees, generates parking receipts, and demonstrates object cloning, serialization, and deserialization.

This project is developed to demonstrate practical Core Java concepts through a modular, object-oriented application.

---

## 📌 Project Overview

The Smart Parking System supports both conventional cars and electric vehicles.

It provides parking slot management, vehicle registration, automated fee calculation, charging fee calculation, receipt generation, and ticket backup functionality.

The project follows a modular package structure with separate classes and interfaces to maintain clean, readable, and reusable code.

## ✨ Key Features

- 🚘 **Vehicle Management** – Supports different vehicle types, including petrol cars and electric cars.
- 🅿️ **Parking Slot Management** – Maintains parking slots using arrays and identifies available slots.
- 💰 **Parking Fee Calculation** – Calculates parking charges based on hourly rates and parking duration.
- ⚡ **EV Charging Management** – Calculates additional charging fees for electric vehicles.
- 🧾 **Receipt Generation** – Generates detailed parking receipts using StringBuilder.
- 📋 **Ticket Cloning** – Demonstrates object cloning using Cloneable.
- 💾 **Serialization** – Saves parking ticket objects into a file.
- 📂 **Deserialization** – Restores saved ticket objects from a file.
- 🔄 **Polymorphism** – Uses parent-class references for different vehicle objects.
- 🧩 **Interface-Based Design** – Separates service contracts from their implementations.

## 🛠️ Technologies Used

- Java 8
- Object-Oriented Programming (OOP)
- Eclipse IDE
- Arrays
- Interfaces
- StringBuilder
- Cloneable
- Serialization and Deserialization
- Exception Handling

## 🧠 Core Java Concepts Implemented

| Concept | Implementation |
|---|---|
| Encapsulation | Private fields and getter methods |
| Abstraction | Abstract Vehicle class |
| Inheritance | Car and ElectricCar extend Vehicle |
| Polymorphism | Vehicle reference for different vehicle objects |
| Interface | ParkingOperations and Chargeable |
| Arrays | Vehicle and ParkingSlot arrays |
| StringBuilder | Parking receipt generation |
| Cloneable | ParkingTicket object cloning |
| Serialization | Saving ticket data into a file |
| Deserialization | Restoring ticket data |
| this keyword | Current object reference |
| super keyword | Parent class constructor invocation |
| Exception Handling | try-catch and multiple exception handling |

## 📂 Project Structure

```text
SmartParkingSystem
│
├── assets
│   └── smart-parking-flow.png
│
├── src
│   │
│   ├── com.smartparking.main
│   │   └── ParkingApplication.java
│   │
│   ├── com.smartparking.model
│   │   ├── Vehicle.java
│   │   ├── Car.java
│   │   ├── ElectricCar.java
│   │   ├── Chargeable.java
│   │   ├── ParkingSlot.java
│   │   └── ParkingTicket.java
│   │
│   ├── com.smartparking.service
│   │   ├── ParkingOperations.java
│   │   └── ParkingServiceImpl.java
│   │
│   └── com.smartparking.utility
│       └── ParkingBackup.java
│
└── README.md
```

## 🔄 Application Execution Flow

The application follows this execution sequence:

1. Start execution from `ParkingApplication.java`.
2. Create Car and ElectricCar objects.
3. Initialize parking slots using an array.
4. Call the parking service through the `ParkingOperations` interface.
5. Find an available parking slot.
6. Calculate parking and EV charging fees.
7. Create the ParkingTicket object.
8. Generate the parking receipt using StringBuilder.
9. Clone the original parking ticket.
10. Serialize the ticket into a file.
11. Deserialize the saved ticket.
12. Display the restored ticket details.

### Execution Flowchart

![Smart Parking System Execution Flow](assets/smart-parking-flow.png)

## ▶️ How to Run the Project

1. Clone or download this repository.
2. Import the project into Eclipse IDE.
3. Make sure Java 8 is configured in the project.
4. Open `ParkingApplication.java`.
5. Run the application as a Java Application.
6. Check the console output.
7. Verify the generated `parking-ticket.dat` backup file in the application's working directory.

## 📊 Sample Business Scenario

An electric car enters the parking facility:

| Detail | Value |
|---|---:|
| Vehicle Registration | KA-05-EV-2024 |
| Parking Duration | 3 Hours |
| Parking Rate | ₹30 / Hour |
| Charging Units | 10 |
| Charging Rate | ₹8 / Unit |
| Parking Fee | ₹90 |
| Charging Fee | ₹80 |
| **Total Amount** | **₹170** |

## 🎯 Learning Outcomes

Through this project, I practiced:

- Implementing OOP principles in a real-world use case.
- Designing applications using separate classes and packages.
- Using interfaces to achieve loose coupling.
- Applying runtime polymorphism.
- Understanding shallow cloning.
- Working with Java object serialization and deserialization.
- Handling exceptions in file operations.
- Building maintainable and reusable Java application structures.

## 🚀 Future Enhancements

- Add user input using Scanner.
- Introduce parking slot categories.
- Implement payment processing.
- Add parking entry and exit timestamps.
- Introduce a database using JDBC.
- Add a Spring Boot REST API.
- Implement persistent vehicle and parking records.

---

**Developed using Java 8 | Core Java | OOP | Industry-Level Practice**

⭐ If you find this project useful, feel free to explore the repository and share your feedback.
