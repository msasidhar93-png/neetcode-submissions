class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j= heights.length-1;
        int result = 0;
        //Area = length * width
        while(i<j){
            int length = Math.min(heights[i], heights[j]);
            int width = j-i;
            int area = length * width;
            result = Math.max(area, result);
            if(length == heights[i]){
                i++;
            }else if(length == heights[j]){
                j--;
            }
        }
        return result;
    }
}
