package ss10_StackDeployment.bai_tap.bai_3;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack bStack = new Stack();
        String bt;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao bieu thuc:");
        bt = input.nextLine();
        String[] str = bt.split("");
        boolean flg = true;
        for (int i = 0; i < str.length ; i++) {
            if (str[i].equals("(")){
                bStack.push(str[i]);
            }
            if (str[i].equals(")")){
                if (bStack.isEmpty()){
                    flg = false;
                }else{
                    bStack.pop();
                }
            }
        }
        if (flg){
            if (bStack.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
        System.out.println(bStack);

    }
}
