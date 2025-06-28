import java.util.*;
public class AnyBaseToAnyBase {
    public static long convert(long num,long base,long ansBase){
        long sum = 0;
        long index  = 0;
        while (num>0) {
            long remainder = num % ansBase;
            num = num / ansBase;
            sum = sum + remainder*(long)Math.pow(base, index);
            index++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num in any base");
        long num = sc.nextLong();
        System.out.println("enter the base");
        long base = sc.nextLong();
        System.out.println("Enter base to be converted into");
        long ansBase = sc.nextLong();

        System.out.printf("Ans : %d", convert(num, base, ansBase));


    }
}
