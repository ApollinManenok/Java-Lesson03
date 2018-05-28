import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter " + length + " numbers separated by space: ");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.nextLine();
        String sortType;
        while (true) {
            System.out.print("Enter 'increase' or 'decrease' to choose sorting type: ");
            sortType = scan.nextLine();
            if (sortType.contentEquals("increase")) {
                Arrays.sort(arr);
                break;
            } else if (sortType.contentEquals("decrease")) {
                Arrays.sort(arr);
                int j = length - 1;
                for (int i = 0; i < length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                break;
            }
            System.out.println("You've entered something wrong try again");
        }
        scan.close();
        System.out.print("Result of " + sortType + " sort: [");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (i < length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
