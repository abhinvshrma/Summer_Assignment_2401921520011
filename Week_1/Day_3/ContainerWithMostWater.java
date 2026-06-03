package Week_1.Day_3;

public class ContainerWithMostWater {
        public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = Integer.MIN_VALUE;
        int p1 = 0 ;
        int p2 = n-1;
        while(p1 < p2){
            int area = Math.min(height[p1],height[p2])*(p2-p1);
            if(height[p1]<height[p2]){
                p1++;
            }
            else p2--;
            maxArea = Math.max(area , maxArea);
        }
        return maxArea;
    }
}
