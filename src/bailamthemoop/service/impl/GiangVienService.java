package bailamthemoop.service.impl;

import bailamthemoop.model.GiangVien;
import bailamthemoop.service.IGiangVienService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiangVienService implements IGiangVienService {
    private static List<GiangVien> giangVienList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void themGiangVien() {
        GiangVien giangVien = infoGiangVien();
        giangVienList.add(giangVien);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void xoaGiangVien() {
        System.out.println("Mời bạn nhập mã cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (GiangVien giangVien : giangVienList) {
            if (giangVien.getMa() == idRemove) {
                System.out.println(" Bạn có chắc là muốn xoá không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    giangVienList.remove(giangVien);
                    System.out.println("Xoá thành công!.");
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
    public void hienThiGiangVien() {
        for (GiangVien giangVien : giangVienList) {
            System.out.println(giangVien);
        }
    }

    @Override
    public void sapXepGiangVien() {

    }

    @Override
    public void timKiemGiangVien() {

    }

    public static GiangVien infoGiangVien() {
        System.out.print("Vui lòng nhập mã giảng viên: ");
        int maGiangVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Vui lòng nhập tên giảng viên: ");
        String tenGiangVien = scanner.nextLine();
        System.out.print("Vui lòng nhập ngày sinh của giảng viên: ");
        String ngaySinhGiangVien = scanner.nextLine();
        System.out.print("Vui lòng nhập giới tính: ");
        String gioiTinhGiangVien = scanner.nextLine();
        System.out.print("Vui lòng nhập chuyên môn: ");
        String chuyenMonGiangVien = scanner.nextLine();
        GiangVien giangVien = new GiangVien(maGiangVien, tenGiangVien, ngaySinhGiangVien, gioiTinhGiangVien, chuyenMonGiangVien);
        return giangVien;
    }
}
