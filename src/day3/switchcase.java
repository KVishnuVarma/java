package day3;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//
//            case "Mango":
//                System.out.println("King of Mango");
//                break;
//            case "Apple":
//                System.out.println("Red fruit apple");
//                break;
//            case "banna":
//                System.out.println("very sweet and cool");
//                break;
//            default:
//                System.out.println("There is no fruit u mentioned");
//        }

        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day choose correct day");
        }
    }
}
