import java.util.*;
public class DigitsFrequency{
    public static int count(long num , int n){
        int count = 0;
        while(num>0){
            long digit = num % 10;
            num = num/10;

            if(digit == n){
                count++;
            }

        }  
        return count;  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        long num = sc.nextLong();
        System.out.println("enter n to be found");
        int n = sc.nextInt();

        System.out.printf("Frequency : %d" , count(num,n));


    }
}