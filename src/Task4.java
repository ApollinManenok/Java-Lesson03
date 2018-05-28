import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg) {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        boolean increasingSequence = false;
        int temp = number;
        while (temp / 10 != 0) {
            if (temp % 10 == (temp / 10 % 10) + 1) {
                increasingSequence = true;
                temp /= 10;
            } else {
                increasingSequence = false;
                break;
            }
        }
        if (increasingSequence)
            System.out.println("Numerals of " + number + " are in increasing sequence");
        else
            System.out.println("Numerals of " + number + " aren't in increasing sequence");
    }
}
