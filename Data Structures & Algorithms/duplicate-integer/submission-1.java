class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
    
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
            
        }
        // return false;
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }
        // for(int i=0;i<mp.size();i++){
        //     if(mp.get(nums[i])==2){
        //         return true;
        //     }
           
        // }
          return false;
    }
}