

import java.util.*;
class SortedArray{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        boolean Sorted = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                Sorted = false;
                break;
            }
        }
        if (Sorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }

    }
  }
}