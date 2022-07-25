package bailamthemoop.controller;

import bailamthemoop.service.IGiangVienService;
import bailamthemoop.service.IHocVienService;
import bailamthemoop.service.impl.GiangVienService;
import bailamthemoop.service.impl.HocVienService;

import java.util.Scanner;

public class HocVienController {
    private IGiangVienService iGiangVienService = new GiangVienService();
    private IHocVienService iHocVienService = new HocVienService();
    private Scanner scanner = new Scanner(System.in);

    public void menuXoa() {
        do {
            System.out.println("1.Xoá giảng viên\n" +
                    "2.Xoá học sinh\n" +
                    "3.Thoát");
            int chonXoa = Integer.parseInt(scanner.nextLine());
            switch (chonXoa) {
                case 1:
                    iGiangVienService.xoaGiangVien();
                    break;
                case 2:
                    iHocVienService.xoaHocVien();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
