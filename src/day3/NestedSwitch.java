package day3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dep = sc.next();

        switch (empId){
            case 1 :
                System.out.println("lokesh");
                break;
            case 2:
                System.out.println("Raghu");
                break;

            case 3:
                System.out.println("Please Enter Employee Id");
                switch (dep){
                    case "IT":
                        System.out.println("It dep");
                        break;
                    case  "NonIt":
                        System.out.println("NonIt dep");
                        break;
                    case "devops":
                        System.out.println("devops dep");
                        break;
                    default:
                        System.out.println("There is no departement");
                }
                break;
            default:
                System.out.println("Enter correct Employee Id");
        }
    }
}
