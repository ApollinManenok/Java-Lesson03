import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 numbers separated by space: ");
        for (int i = 0; i < 10; i++) {

            arr[i] = scan.nextInt();
        }
        scan.close();
        int[][] matrix = new int[10][2];
        matrix[0][0] = arr[0];
        int lastFilledIndex = 1;
        boolean match = false;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < lastFilledIndex; j++) {
                if (matrix[j][0] == arr[i]) {
                    matrix[j][1]++;
                    match = true;
                    break;
                }
            }
            if (match)
                match = false;
            else {
                matrix[lastFilledIndex][0] = arr[i];
                lastFilledIndex++;
            }
        }
        for (int i = 0; i < lastFilledIndex; i++) {
            if (matrix[i][1] > 0)
                System.out.println("[" + matrix[i][0] + "] repeats " + (matrix[i][1] + 1) + " times.");
        }
    }
}
