package ss11_java_collection_framewwork.bai_tap.Controller;

import java.util.Scanner;

public class MainController {
    public void disPlayMenu() {
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            System.out.println("============ Menu ============");
            System.out.println("1. Thêm sản Phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần,giảm dần theo giá");
            System.out.println("7. Thoát");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose < 1 || choose > 7) {
                System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
                continue;
            }
            switch (choose) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.exit(0);
                    break;

            }
        } while (true);
    }

    public static void main(String[] args) {
        MainController main = new MainController();
        main.disPlayMenu();
    }
}
