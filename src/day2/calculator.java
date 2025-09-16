package day2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter an operator: ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/'){
                System.out.print("Enter a value: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
            }else if (op == 'x' || op =='X'){
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}
