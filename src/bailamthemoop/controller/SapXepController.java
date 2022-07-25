package bailamthemoop.controller;

import bailamthemoop.service.IGiangVienService;
import bailamthemoop.service.IHocVienService;
import bailamthemoop.service.impl.GiangVienService;
import bailamthemoop.service.impl.HocVienService;

import java.util.Scanner;

public class SapXepController {
    private IGiangVienService iGiangVienService = new GiangVienService();
    private IHocVienService iHocVienService = new HocVienService();

    private Scanner scanner = new Scanner(System.in);

    public void menuSapxep() {
        do {
            System.out.println("1.Sắp xếp học viên\n" +
                    "2.Sắp xếp giảng viên\n" +
                    "3.Thoát");
            int chonSapXep = Integer.parseInt(scanner.nextLine());
            switch (chonSapXep) {
                case 1:
                    iHocVienService.sapXepHocVien();
                    break;
                case 2:
                    iGiangVienService.sapXepGiangVien();
                    break;
                case 3:
                    return;
            }

        } while (true);
    }
}
