import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array!");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("enter the elements in the array.");

        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element to be found");

        int el = sc.nextInt();

        int index = -1;
        for(int i=0;i<num;i++){
            if(el == arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("element not found!");
        }else{
            System.out.printf("element found at %d",index);
        }
    }
}
