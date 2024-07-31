import java.util.Scanner;

public class marks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sub 1 : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter the Sub 2 : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter the Sub 3 : ");
        int sub3 = sc.nextInt();

        System.out.print("Enter the Sub 4 : ");
        int sub4 = sc.nextInt();

        System.out.print("Enter the Sub 5 : ");
        int sub5 = sc.nextInt();

        //calculate the marks of student
        int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (totalmarks / 5.0);

        //Display the Percentage
        System.out.println("Total Marks " + totalmarks + " out of 500");
        System.out.println("Percentage : " + percentage + "%");

        sc.close();

    }
}
