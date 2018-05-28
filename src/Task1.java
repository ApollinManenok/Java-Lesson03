import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 numbers separated by space: ");
        for (int i = 0; i < 10; i++) {
            //System.out.print("\nEnter number " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        scan.close();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < 10; i++) {
            if (min > arr[i])
                min = arr[i];
            else if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Max number: " + max + "\nMin number: " + min);
        for (int i = 0; i < 10; i++) {
            if (min == arr[i])
                arr[i] = 0;
            else if (max == arr[i])
                arr[i] = 99;
        }
        System.out.print("Your result array: [");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
            if (i < 9)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
