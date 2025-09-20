package day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Even And Odd Number

        int z = sc.nextInt();
        if (z % 2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        //Greetings Your Name

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello" + " " + name + " " + "Welcome to Java");

        //Simple interst
//
        double p =sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double si = (p * t * r) /100;
        System.out.println(si);

        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter an operator");
        String op = sc.next();
        if (op.equals("+")){
            System.out.println(x+y);
        }
        else if (op.equals("-")){
            System.out.println(x-y);
        }
        else if (op.equals("*")){
            System.out.println(x*y);
        }
        else if (op.equals("/")){
            System.out.println(x/y);
        }

        //Take 2 numbers as input and print the largest number.

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a,b);
        System.out.println(c);

        //Input currency in rupees and output in USD.

        int indian_rupees = sc.nextInt();
        float usd = 88.27F;
        double convert = indian_rupees / usd;
        System.out.println(convert);

//        To calculate Fibonacci Series up to n numbers.

        int n = sc.nextInt();
        int d = 0, e = 1;
        for (int i = 1; i<=n;i++){
            int h = d+e;
            d = e;
            e = h;
            System.out.print(d + " ");
        }

        //To find out whether the given String is Palindrome or not.

        String s = sc.next();
        String rev = "";
        for (int i = s.length() - 1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

    }
}
