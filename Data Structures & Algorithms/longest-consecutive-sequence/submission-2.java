class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        Map<Integer,Boolean> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,false);
        }
        for(int i:nums){
            int l=1;
            int nextnum=i+1;
            while(mp.containsKey(nextnum) && mp.get(nextnum)==false){
                l++;
                mp.put(nextnum,true);
                nextnum++;
            }
            int prenum=i-1;
            while(mp.containsKey(prenum) && mp.get(prenum)==false){
                l++;
                mp.put(prenum,true);
                prenum--;
            }
            longest=Math.max(l,longest);
        }
        return longest;
    }
}
