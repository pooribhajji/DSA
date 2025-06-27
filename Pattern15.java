import java.util.Scanner;
import java.math.*;
//USE MAT.abs() ==> for finding abstract value
//Part of the Java.math.lang package
public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num");

        int num = sc.nextInt();

        int mid = num/2 + 1;
        int x = mid + 1;

        int k = 2;

        for(int i = 1;i<= num;i++){   //i==>Gives no of rows
            if(i <= mid){
                int j1 = 2*(i-1)+1;  // j1 ==> gives no of elements
                    for(int spaces=1;spaces<=Math.abs(mid-i);spaces++){
                        System.out.print("\t");
                    }
                    for(int el = i;el<=j1;el++){
                        System.out.printf("%d\t",el);
                    }
                    for(int el = j1-1;el>=i;el--){
                        System.out.printf("%d\t",el);
                    }
                    System.out.println();
            }else{
                    
                    int j2 = 2*(i-k-1)+1; // j2 ==> gives no of elements
                    for(int spaces=1;spaces<=Math.abs(mid-i);spaces++){
                        System.out.print("\t");
                    }
                    for(int el =num-i+1;el<=j2;el++){
                        System.out.printf("%d\t",el);
                    }
                    for(int el = j2-1;el>=num-i+1;el--){
                        System.out.printf("%d\t",el);
                    }
                    System.out.println();
                    k=k+2;
            }
        }
    }
}


