class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))!=true){
                map.put(s.charAt(right),1);
            }
            else{
                int count=map.get(s.charAt(right));
                count++;
                map.put(s.charAt(right),count);
            }
            
            while(map.size()<right-left+1){
                int count=map.get(s.charAt(left));
                count--;
                if(count==0){
                    map.remove(s.charAt(left));
                }
                else{
                    map.put(s.charAt(left),count);
                }
                left++;
            }
            if(map.size()==right-left+1){
                max=Math.max(max,right-left+1);
            }
            right++;
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
