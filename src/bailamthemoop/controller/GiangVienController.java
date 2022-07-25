package bailamthemoop.controller;

import bailamthemoop.service.IGiangVienService;
import bailamthemoop.service.IHocVienService;
import bailamthemoop.service.impl.GiangVienService;
import bailamthemoop.service.impl.HocVienService;

import java.util.Scanner;

public class GiangVienController {
    private IGiangVienService iGiangVienService = new GiangVienService();
    private IHocVienService iHocVienService =new HocVienService();
    private Scanner scanner = new Scanner(System.in);
    public void menuThem() {
        do {
            System.out.println("1.Thêm mới giảng viên\n" +
                    "2.Thêm mới học sinh\n" +
                    "3.Thoát");
            int chonThem = Integer.parseInt(scanner.nextLine());
            switch (chonThem) {
                case 1:
                    iGiangVienService.themGiangVien();
                    break;
                case 2:
                    iHocVienService.themHocVien();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
