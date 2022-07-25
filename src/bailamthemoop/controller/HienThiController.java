package bailamthemoop.controller;

import bailamthemoop.service.IGiangVienService;
import bailamthemoop.service.IHocVienService;
import bailamthemoop.service.impl.GiangVienService;
import bailamthemoop.service.impl.HocVienService;

import java.util.Scanner;

public class HienThiController {
    private IGiangVienService iGiangVienService = new GiangVienService();
    private IHocVienService iHocVienService = new HocVienService();
    private Scanner scanner = new Scanner(System.in);
    public void menuHienThi() {
        do {
            System.out.println("1.Hiển thị học viên\n" +
                    "2.hiển thị giảng viên\n" +
                    "3.Thoát");
            int chonHienThi = Integer.parseInt(scanner.nextLine());
            switch (chonHienThi) {
                case 1:
                  iHocVienService.hienthiHocVien();
                  break;
                case 2:
                    iGiangVienService.hienThiGiangVien();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
