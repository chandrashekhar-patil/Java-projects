import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first subject : ");
        int a = sc.nextInt();

        System.out.print("Enter the second subject : ");
        int b = sc.nextInt();

        System.out.print("Enter the three subject : ");
        int c = sc.nextInt();

        int totalmarks = a + b + c;
        double percentage = totalmarks / 3.0;
        double CGPA = percentage / 9.5;

        System.out.println("CGPA : " + CGPA);
    }
}
