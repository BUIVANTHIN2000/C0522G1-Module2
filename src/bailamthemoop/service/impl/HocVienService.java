package bailamthemoop.service.impl;

import bailamthemoop.model.HocVien;
import bailamthemoop.service.IHocVienService;

import java.util.*;

public class HocVienService implements IHocVienService {
    private static List<HocVien> hocVienList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void themHocVien() {
        HocVien hocVien = infoHocVien();
        hocVienList.add(hocVien);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void xoaHocVien() {
        System.out.println("Mời bạn nhập mã cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (HocVien hocVien : hocVienList) {
            if (hocVien.getMa() == idRemove) {
                System.out.println(" Bạn có chắc là muốn xoá không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    hocVienList.remove(hocVien);
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
    public void hienthiHocVien() {
        for (HocVien hocVien : hocVienList) {
            System.out.println(hocVien);
        }
    }

    @Override
    public void sapXepHocVien() {

    }

    @Override
    public void timKiemHocVien() {

        }

    public static HocVien infoHocVien() {
        System.out.print("Vui lòng nhập mã học viên: ");
        int maHocVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Vui lòng nhập tên học viên: ");
        String tenHocVien = scanner.nextLine();
        System.out.print("Vui lòng nhập ngày sinh học viên: ");
        String ngaySinhHocVien = scanner.nextLine();
        System.out.print("Vui lòng nhập giới tính học viên: ");
        String gioiTinhHocVien = scanner.nextLine();
        System.out.print("Vui lòng nhập lớp học viên: ");
        String lop = scanner.nextLine();
        System.out.print("Vui lòng nhập điểm số học viên: ");
        Double diem = Double.parseDouble(scanner.nextLine());
        HocVien hocVien = new HocVien(maHocVien, tenHocVien, ngaySinhHocVien, gioiTinhHocVien, lop, diem);
        return hocVien;
    }
}
