import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int space=1;space<i;space++){
                System.out.print("\t");
            }
            for(int star=1;star<=num+1-i;star++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
