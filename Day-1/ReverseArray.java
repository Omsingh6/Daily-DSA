

public class ReverseArray{
    public static void main(String args[]){
       
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length-1;

        while( left < right ){
           
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        for(int i : arr){
            System.out.print( i +" ");
        }

        

    }

}