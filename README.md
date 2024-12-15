Mall Parking Management System
PROJECT OVERVIEW
The Mall Parking Management System is a Java-based console application that efficiently manages parking slots in a mall. The system allows vehicles to be parked, removed, and calculates parking fees based on the time parked. It also includes data persistence using file handling to save parking data between program runs.
This project demonstrates the use of Object-Oriented Programming (OOP) principles, Java Collections, and File I/O, making it an excellent choice for learning and showcasing core Java concepts.
FEATURES
	1.	Park a Vehicle
	•	Assigns the next available parking slot to a vehicle.
	•	Automatically records the time of entry using the system clock.
	2.	Remove a Vehicle
	•	Removes the vehicle from its slot and calculates the total hours parked.
	•	Charges a fee of $10 per hour with a minimum charge for 1 hour.
	3.	View Parking Status
	•	Displays the real-time status of all parking slots:
	•	Shows occupied slots with the vehicle number and entry time.
	•	Indicates empty slots.
	4.	Data Persistence
	•	Saves parking data to a file (parkingData.txt) when the program exits.
	•	Reloads saved data when the program starts to ensure continuity.
	5.	User-Friendly Menu
	•	Offers an easy-to-navigate, menu-driven interface for managing the parking system.
TECHNOLOGIES USED
	•	Programming Language: Java
	•	Concepts Implemented:
	•	Object-Oriented Programming (OOP)
	•	Collections (ArrayList)
	•	File Handling (File I/O)
	•	Exception Handling
	•	Date and Time (LocalDateTime)
HOW TO RUN THE PROJECT
1.	Prerequisites:
    •	Install Java Development Kit (JDK) version 8 or higher.
    •	Any IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or terminal to compile and run the program.
2.	Steps to Run:
    •	Copy the project code into a file named MallParkingSystem.java.
    •	Compile the program using the terminal:
                     javac MallParkingSystem.java
    •	Run the program:
                     java MallParkingSystem
4.	Using the Application:
	•	Follow the on-screen menu to perform actions:
	•	View Parking Slots
	•	Park a Vehicle
	•	Remove a Vehicle
	•	Save & Exit
System Workflow
	1.	On startup, the system loads the parking data (if available) from a file.
	2.	The user interacts with the system through a menu-driven interface:
	•	Park a Vehicle: Enters vehicle details and assigns a parking slot.
	•	Remove a Vehicle: Frees up the slot and calculates the parking fee.
	•	View Parking Status: Displays the current state of all slots.
	3.	On exiting, the system saves the updated parking data to a file for future use.

SAMPLE MENU
=== Mall Parking Management System ===
1. View Parking Slots
2. Park a Vehicle
3. Remove a Vehicle
4. Save & Exit
Enter your choice: 

File Storage
	•	Parking data is stored in a file named parkingData.txt using Java Object Serialization.
	•	The data is reloaded automatically when the program starts to restore the previous parking state.

Example Output

=== Mall Parking Management System ===
1. View Parking Slots
2. Park a Vehicle
3. Remove a Vehicle
4. Save & Exit
Enter your choice: 2
Enter Vehicle Number: ABC123
Vehicle ABC123 parked in Slot 1

Enter your choice: 1
--- Parking Slots Status ---
Slot 1: Vehicle ABC123 | Entered at: 2024-06-15T12:00
Slot 2: Empty
Slot 3: Empty
...

Enter your choice: 3
Enter Vehicle Number to Remove: ABC123
Vehicle ABC123 removed from Slot 1
Total Hours Parked: 2 | Parking Fee: ₹20.0

Future Enhancements
	•	Add a GUI using Java Swing or JavaFX for better user experience.
	•	Integrate a database (e.g., MySQL) for persistent data storage.
	•	Include admin login functionality for added security.
	•	Add a feature to reserve parking slots in advance.

Conclusion

The Mall Parking Management System is a beginner-friendly Java project that showcases essential programming skills. It is well-structured, scalable, and can be further enhanced with additional features. This project is ideal for students and developers looking to build their portfolio with a practical, real-world Java application.
