class TrappingRainWater {

    public int trapping(int[] height) {
      int n = height.length;
      int left =0;
      int right =n-1;
      int leftmax=0;
      int rightmax =0;
      int watertrap = 0;

      while(left < right ){

        if(height[left] < height[right]){

          if(height[left] >= leftmax){
            leftmax = height[left];
          }else {
            watertrap  += leftmax - height[left];
          }
          left++;

        }else {

          if(height[right] >= rightmax){
            rightmax = height[right];
          }else{
            watertrap += rightmax - height[right];
          }
          right--;
        }
      }
    return watertrap;
  }

 public static void main(String args[]){

  int[] arr = { 4, 2, 0, 6, 3, 2, 5};

  TrappingRainWater obj = new TrappingRainWater();

  int result = obj.trapping(arr);

  System.out.println("Total trapped water =" + result);

 }
 

}