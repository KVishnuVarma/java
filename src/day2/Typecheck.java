package day2;

import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String si = sc.next().trim();
//        char s = sc.next().trim().charAt(5);
//
//        System.out.println(s);
//
//        if (s >= 'a' && s <='z'){
//            System.out.println("lowercase");
//        }
//        else {
//            System.out.println("Upper Case");
//        }
//        int m = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count <= m){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.print(b);

//        int m = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;

//        while (count <= m){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.print(b);

        int n = 45525;
        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
