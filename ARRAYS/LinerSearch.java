import java.util.*;

class LinerSearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter araay");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == x) {
                    found = true;
                    break;
                }
            }
                if (found) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            
        }

    }

}
