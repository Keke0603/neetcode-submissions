class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=-1;
            int element=-1;
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                if(e.getValue()>maxfreq){
                    maxfreq=e.getValue();
                    element=e.getKey();
                }

            }
            ans[i]=element;
            map.remove(element);
        }
        return ans;
        
    }
}