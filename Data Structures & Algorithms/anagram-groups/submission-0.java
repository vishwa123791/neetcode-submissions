class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
       Map<String,List<String>> fremap=new HashMap<>();
       for(String str:strs){
        String fre=getfrequency(str);
        if(fremap.containsKey(fre)){
            fremap.get(fre).add(str);
        }
        else{
            List<String> ls=new ArrayList<>();
            ls.add(str);
            fremap.put(fre,ls);
        }
       }
       return new ArrayList<>(fremap.values());
    }
    String getfrequency(String str){
        int fr[]=new int[26];
        for(char c:str.toCharArray()){
            fr[c-'a']++;
        }
        StringBuilder st=new StringBuilder();
        char c='a';
        for(int i:fr){
            st.append(c);
            st.append(i);
            c++;
        }
        return st.toString();
    }
}
