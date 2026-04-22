import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word you want to reverse :");
        String str = sc.nextLine();

        char arr[] = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        String revsersed = new  String(arr);
        System.out.println(revsersed);
    }
}
