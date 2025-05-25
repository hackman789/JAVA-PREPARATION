import java.util.*;

public class SUMANDAVERAGEARRAY {

    public static void SumAndAvg(int arr[]) {
        Scanner sc = new Scanner(System.in);
        if (arr.length == 0) {
            System.out.println("Array is Empty");
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count = count + 1;
        }
        System.out.println("Sum Of ARRAY+ " + sum);
        System.out.println("COunt of elements =" + count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            SumAndAvg(arr);
        }

    }

}
