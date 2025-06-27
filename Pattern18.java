import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eneter num");
        int num = sc.nextInt();
        int mid = num/2 + 1;

        for(int i = 1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i == 1 || i == num ||  j==i || j + i == num + 1 ){
                    System.out.print("*\t");
                }
                else if( i > mid &&  j < i  && j > num - i + 1 ){
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