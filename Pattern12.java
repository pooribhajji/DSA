import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 0;i<num;i++){
            for(int j = 0;j<=i;j++){

                if( i == 0 && j == 0){
                    System.out.print(a);
                }
                else{
                    
                    int x = a + b;
                    a = b;
                    b = x;
                    System.out.print(x + " ");
                }

            }
            System.out.println();
        }
    }
}
