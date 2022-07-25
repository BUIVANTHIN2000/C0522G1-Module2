package bailamthemoop1.contronller;

import bailamthemoop1.sevice.ICarSevicer;
import bailamthemoop1.sevice.impl.CarSevicer;

import java.util.Scanner;

public class VehicleController {
   private ICarSevicer iCarSevicer = new CarSevicer();
 private Scanner scanner = new Scanner(System.in);
    public void menuAddVehicle() {
        do {
            System.out.println("Add new vehicle\n" +
                    "1. Add Truck\n" +
                    "2. Add Car\n" +
                    "3. Add Motobycle\n" +
                    "4. Exit");
            int chooseAddVehicle = Integer.parseInt(scanner.nextLine());
            switch (chooseAddVehicle) {
                case 1:{

                    break;
                }
                case 2: {
                    iCarSevicer.add();
                    break;
                }
                case 3:{
                    break;
                }
                case 4: {
                    return;
                }

            }
        }while (true);
    }
}
