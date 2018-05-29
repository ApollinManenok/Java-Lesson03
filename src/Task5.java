import java.util.Scanner;

public class Task5 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter " + arr.length + " numbers separated by space: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.nextLine();
        String sortType;
        while (true) {
            System.out.print("Enter 'increase' or 'decrease' to choose sorting type: ");
            sortType = scan.nextLine();
            if (sortType.contentEquals("increase")) {
                for (int i = arr.length - 1; i > 0; i--) { //increase sorting bubble
                    for (int j = 0; j < i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            } else if (sortType.contentEquals("decrease")) {
                for (int i = 0; i < arr.length; i++) { // decrease selection sorting
                    int max = arr[i];
                    int maxInd = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] > max) {
                            max = arr[j];
                            maxInd = j;
                        }
                    }
                    if (i != maxInd) {
                        int temp = arr[i];
                        arr[i] = arr[maxInd];
                        arr[maxInd] = temp;
                    }
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
