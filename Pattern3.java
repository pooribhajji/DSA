import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int space = 1;space<=num-i;space++){ 
                System.out.print("\t");
            }
            for(int star=1;star<=i;star++){
                System.out.print("\t*");

            }
            System.out.println();
        }
    }
}
