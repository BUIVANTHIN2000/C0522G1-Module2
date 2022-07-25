package ss10_StackDeployment.bai_tap.bai_2;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x = sc.nextInt();
        while (x >0) {
            int SoDu = x%2;
            stackSoDu.push(SoDu);
            x = x/2;
        }
        System.out.println("số nhị phân là");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}