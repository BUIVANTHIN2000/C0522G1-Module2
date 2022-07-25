package bailamthemoop1.sevice.impl;

import bailamthemoop1.model.Car;
import bailamthemoop1.sevice.ICarSevicer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSevicer implements ICarSevicer {
    private static List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Car car = infoCar();
        carList.add(car);
        System.out.println("Successfully added new! ");
    }

    @Override
    public void disPlay() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Car car : carList) {
            if (car.getSeaOfControl() == idRemove) {
                System.out.println(" Are you sure you want to delete it? \n" +
                        "1. Yes \n" +
                        "2. No");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    carList.remove(car);
                    System.out.println("Delete Complete!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void search() {

    }

    public static Car infoCar() {
        System.out.print("Enter sea of control: ");
        int seOfControl = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter manufacture name: ");
        String manufatureName = scanner.nextLine();
        System.out.print("Enter yearManuFature: ");
        String yearManuFature = scanner.nextLine();
        System.out.print("Enter Owner: ");
        String owner = scanner.nextLine();
        System.out.print("Enter number of seats: ");
        String numberOfSeats = scanner.nextLine();
        System.out.print("Enter vihecle type: ");
        String vihecleType = scanner.nextLine();
        Car car = new Car(seOfControl,manufatureName,yearManuFature,owner,numberOfSeats,vihecleType);
        return car;
    }
}
