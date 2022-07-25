package ss12_thuattoan_timkiem.bai_tap.timchuoitangdan.bai_tap.bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> max = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) < list.get(list.size() - 1)) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}