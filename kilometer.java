import java.util.*;
public class kilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometer : ");
        int kilometer = sc.nextInt();

        double conversionFactor = 0.621371;

        double mile = kilometer * conversionFactor;

        System.out.println("Kilometer : " + kilometer + " is equal to " + mile + " mile");

    }
}
