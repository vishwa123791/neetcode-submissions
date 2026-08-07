class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxare=0;
        while(l<=r){
            int leng=Math.min(heights[l],heights[r]);
            int bre=r-l;
            maxare=Math.max(maxare,leng*bre);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxare;
    }
}
