import java.util.Scanner;

public class Pattern20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num");
        int num = sc.nextInt();
        int mid = num/2 + 1;

        for(int i = 1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j == 1 || j == num ){
                    System.out.print("*\t");
                }
                else if( i >= mid && (i == j ||  i + j ==  num + 1  ) ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}