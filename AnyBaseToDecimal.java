import java.util.Scanner;

public class AnyBaseToDecimal {

    public static long decimal(long num , long base ){
        long ans = 0;
        int k = 0;
        while(num>0){
            long remainder = num % 10 ;
            num = num/10;
            ans = ans + remainder*(long)Math.pow(base,k);
            k++;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        long num = sc.nextInt();
        System.out.println("Enter the base");
        long base = sc.nextInt();

        System.out.printf("Decimal : %d" , decimal(num, base));


    }
}