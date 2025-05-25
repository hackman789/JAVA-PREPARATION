import java.util.Scanner;

public class SecondLargest {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int first = Integer.MIN_VALUE , second = Integer.MIN_VALUE;
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] =sc.nextInt();
            }
            for(int i=1;i<n;i++){
                if(a[i]>first){
                    second = first;
                    first = a[i];
                }
                else if(a[i]>second && a[i]!= first){
                     second = a[i];
                }
            }    
                System.out.println("Second Lagest"+ second);
        
        }
    }
    
}
