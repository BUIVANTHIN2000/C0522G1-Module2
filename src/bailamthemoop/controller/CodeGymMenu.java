package bailamthemoop.controller;

import java.util.Scanner;

public class CodeGymMenu {

    public static void menuCodeGym() {
        GiangVienController giangVienController = new GiangVienController();
        HocVienController hocVienController = new HocVienController();
        HienThiController hienThiController = new HienThiController();
        SapXepController sapXepController = new SapXepController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN\n" +
                    "Chọn chức năng theo số(để tiếp tục)\n" +
                    "1.Thêm mới giảng viên hoặc học sinh\n" +
                    "2.Xoá giảng viên hoặc học sinh\n" +
                    "3.Xem danh sách học viên và giảng viên\n" +
                    "4.Sắp xếp danh sách học viên và giảng viên\n" +
                    "5.Tìm kiếm danh sách học viên và giảng viên\n" +
                    "6.Thoát\n" +
                    "Chọn chức năng: ");
            int chonChuongTrinh = Integer.parseInt(scanner.nextLine());
            switch (chonChuongTrinh) {
                case 1:
                    giangVienController.menuThem();
                    break;
                case 2:
                    hocVienController.menuXoa();
                    break;
                case 3:
                    hienThiController.menuHienThi();
                    break;
                case 4:
                    sapXepController.menuSapxep();
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
