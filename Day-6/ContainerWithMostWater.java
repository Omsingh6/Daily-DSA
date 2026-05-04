
class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

    ContainerWithMostWater obj = new ContainerWithMostWater();

    int[] height = {1,8,6,2,5,4,8,3,7};

    int result = obj.maxArea(height);

    System.out.println("Maximum Water: " + result);
}
}