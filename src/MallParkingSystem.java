import java.util.ArrayList;
import java.util.Scanner;

class ParkingSlot {
    private int slotNumber;
    private String vehicleNumber;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.vehicleNumber = null; // Slot is empty initially
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public boolean isAvailable() {
        return vehicleNumber == null;
    }

    public void parkVehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void removeVehicle() {
        this.vehicleNumber = null;
    }

    @Override
    public String toString() {
        if (isAvailable()) {
            return "Slot " + slotNumber + ": Empty";
        } else {
            return "Slot " + slotNumber + ": Vehicle " + vehicleNumber;
        }
    }
}

public class MallParkingSystem {
    private static final int TOTAL_SLOTS = 100; // Total parking slots in the mall
    private ArrayList<ParkingSlot> parkingSlots;
    private Scanner scanner;

    public MallParkingSystem() {
        parkingSlots = new ArrayList<>();
        scanner = new Scanner(System.in);
        for (int i = 1; i <= TOTAL_SLOTS; i++) {
            parkingSlots.add(new ParkingSlot(i));
        }
    }

    public void displayMenu() {
        System.out.println("\n=== Mall Parking Management System ===");
        System.out.println("1. View Parking Slots");
        System.out.println("2. Park a Vehicle");
        System.out.println("3. Remove a Vehicle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void viewSlots() {
        System.out.println("\n--- Parking Slots Status ---");
        for (ParkingSlot slot : parkingSlots) {
            System.out.println(slot);
        }
    }

    public void parkVehicle() {
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine();

        for (ParkingSlot slot : parkingSlots) {
            if (slot.isAvailable()) {
                slot.parkVehicle(vehicleNumber);
                System.out.println("Vehicle " + vehicleNumber + " parked in Slot " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking Full! No slots available.");
    }

    public void removeVehicle() {
        System.out.print("Enter Vehicle Number to remove: ");
        String vehicleNumber = scanner.nextLine();

        for (ParkingSlot slot : parkingSlots) {
            if (!slot.isAvailable() && slot.getVehicleNumber().equals(vehicleNumber)) {
                slot.removeVehicle();
                System.out.println("Vehicle " + vehicleNumber + " removed from Slot " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Vehicle not found in the parking slots!");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    viewSlots();
                    break;
                case 2:
                    parkVehicle();
                    break;
                case 3:
                    removeVehicle();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        MallParkingSystem parkingSystem = new MallParkingSystem();
        parkingSystem.run();
    }
}