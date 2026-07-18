class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int max1=0;
        int count=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(!set.contains(x-1)){
                int currentnum=x;
                count=1;
                 while(set.contains(currentnum+1)){
                    count++;
                    currentnum++;
                 }
                 max1=Math.max(count,max1);
            }
        }
        return max1;
    }
}
