package primtive;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
//        int a = 10;
//        if(a == 10 ){
//            System.out.println("Hello world");
//        }
//        int count = 1;
//        while (count != 5){
//            System.out.println(count);
//            count ++;
//        }
//        for (int i = 1; i != 5; i++){
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your temp in C: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
