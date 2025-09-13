/*1. Grading System
Problem Statement:
Write a program that takes a student's percentage as input and assigns a grade based on the
following criteria:
90% and above → A
80% to 89% → B
70% to 79% → C
60% to 69% → D
Below 60% → F
*/

import java.util.Scanner;
public class Grading_Sys_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        System.out.print("Enter the marks m1: ");
        int m1=scanner.nextInt();
        System.out.print("Enter the marks m2: ");
        int m2=scanner.nextInt();
        System.out.print("Enter the marks m3: ");
        int m3=scanner.nextInt();
        scanner.close();

        if(m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100){
            System.out.println("Invalid Input");
            return;
        }

        if(m1<40 || m2<40 || m3<40){
            System.out.println("The student has failed");
            return;
        }

        int totalMarks = m1 + m2 + m3;
        double percentage = (totalMarks / 300.0) * 100;
        char grade;

        switch ((int)percentage / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("The student's percentage is: " + percentage + "%");
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}
