package bailamthemoop1.contronller;


import bailamthemoop1.sevice.impl.CarSevicer;

import java.util.Scanner;

public class MenuVehicle {
    public static void menuVehicle() {
        CarSevicer carSevicer = new CarSevicer();
        TructController tructController = new TructController();
        MotocycleController motocycleController = new MotocycleController();
        VehicleController vehicleController = new VehicleController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("VEHICLE MANAGEMENT PROGRAM\n" +
                    "Select function\n" +
                    "1. Add new vehicle\n" +
                    "2. Display vehicle\n" +
                    "3. Delete vehicle\n" +
                    "4. Search by ID\n" +
                    "5. Exit");
            System.out.print("Please enter your selection: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    vehicleController.menuAddVehicle();
                    break;
                }
                case 2: {
                    carSevicer.disPlay();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    System.exit(1);
                }
            }
        } while (true);
    }
}
