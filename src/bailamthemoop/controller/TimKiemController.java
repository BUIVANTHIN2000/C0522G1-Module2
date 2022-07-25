package bailamthemoop.controller;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TimKiemController {
    private Scanner scanner = new Scanner(System.in);
    public void menuTimKiem() {
        do {
            System.out.println("MENU TÌM KIẾM\n" +
                    "1.Tìm kiếm theo id học viên\n" +
                    "2.Tìm kiếm theo id giảng viên\n" +
                    "3.Tìm kiếm theo tên giảng viên\n" +
                    "4.Tìm kiếm theo tên giảng viên\n" +
                    "5.Thoát khỏi menu");
            int chonTimKiem = Integer.parseInt(scanner.nextLine());
            String name;
            switch (chonTimKiem) {
                case 1:
                    System.out.print("Vui lòng nhập id cần tìm kiếm: ");
                    String id = scanner.nextLine();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
