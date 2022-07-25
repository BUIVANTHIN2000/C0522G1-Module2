package ss10_StackDeployment.bai_tap.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();

        System.out.println("Nhập vào chuỗi: ");
        String s = sc.nextLine();
        String[] w = s.split("");
        for (int i = w.length - 1; i >= 0; i--) {
            stackChuoi.push(w[i]);
        }
        for (int i = stackChuoi.size(); i > 0; i--) {
            System.out.println(stackChuoi.pop());
        }
    }
}
