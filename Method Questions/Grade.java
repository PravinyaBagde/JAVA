import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 : ");
        int marks = ip.nextInt();


        if (marks < 0 || marks > 100) {
            System.out.print("Invalid Marks !!!");
        } else {
            char grade = CalculateGrade(marks);
            System.out.print("Your grade is : " + grade);
        }
    }
public static char CalculateGrade(int marks){
    char grade;

    if( marks >= 91 && marks <= 100) {
        grade = 'A';
    } else if (marks >= 80 && marks < 90){
        grade = 'B';
    } else if (marks >= 70 && marks < 80){
        grade= 'C';
    } else if (marks >= 60 && marks < 70) {
        grade = 'D';
    }
    else {
        grade = 'F';
    }
    return  grade;
}
}

