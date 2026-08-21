class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> buc[]=new List[nums.length+1];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int key:mp.keySet()){
            int ab=mp.get(key);
            if(buc[ab]==null){
                buc[ab]=new ArrayList<>();
            }
            buc[ab].add(key);
        }
        int res[]=new int[k];
        int c=0;
        for(int i=buc.length-1;i>=0 && c<k;i--){
            if(buc[i]!=null){
                for(Integer a:buc[i]){
                    res[c++]=a;
                }
            }        
            }
            return res;
    }
}
