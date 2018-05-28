import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg) {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        boolean increasingSequence = false;
        int temp = number;
        int lowerTemp = temp/10;
        while (lowerTemp != 0) {
            if (temp % 10 > (lowerTemp % 10)) {
                increasingSequence = true;
                temp = lowerTemp;
                lowerTemp /= 10;
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
