import java.util.Scanner;
public class FindLarSmall {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");
        for(int i=0; i<n; i++){
           arr[i] =sc.nextInt();
        }
           System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\n");
        
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
         
        System.out.println("Smallest : "+ min);
        System.out.println("largest :"+ max);
    }
}
