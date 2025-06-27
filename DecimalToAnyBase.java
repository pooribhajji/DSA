import java.util.Scanner;

public class DecimalToAnyBase {
    public static int octal(int num){
        int sum = 0;
        int p = 0;
        while (num>0) {
            int remainder = num % 8;
            num = num / 8;
            sum = sum + remainder*(int)Math.pow(10, p);
            p++;
        }
        
        return sum;
    }

    public static int binary(int num){
        int sum = 0;
        int p = 0;
        while (num>0) {
            int remainder = num % 2;
            num = num / 2;
            sum = sum + remainder*(int)Math.pow(10, p);
            p++;
        }
        
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number");
        int num = sc.nextInt();
        System.out.println("enter the base of conversion");
        int base = sc.nextInt();

        if(base == 8){
            System.out.printf(" %d ", octal(num));

        }else if(base == 2){
            System.out.printf(" %d ", binary(num));
        }else{
            System.out.println("Try Again!");
        }



    }
}