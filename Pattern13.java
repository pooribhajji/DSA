import java.util.Scanner;

public class Pattern13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] arr = new int[num][num];

        for(int i =0 ; i< num;i ++){
            for(int j = 0 ; j <=i ;j++){
                if(i == j || j == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        for(int i = 0;i<num;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}