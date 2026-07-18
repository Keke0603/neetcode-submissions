class Solution {
    public int trap(int[] height) {
        int total=0;
        int left=0;
        int right=height.length-1;
        int lm=0;
        int rm=0;
        while(left<right){
            lm=Math.max(height[left],lm);
            rm=Math.max(height[right],rm);
            if(lm<=rm){
                total+=lm-height[left++];
            }
            else if(rm<=lm){
                total+=rm-height[right--];
            }
        }
        return total;
    }
}
