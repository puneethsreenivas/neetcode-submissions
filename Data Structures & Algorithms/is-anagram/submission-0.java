class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.replaceAll("\\s","").toLowerCase();
        t=t.replaceAll("\\s","").toLowerCase();
        if(s.length()!=t.length()){
            return false;
        }
        
            char[] st=s.toCharArray();
           char[] ts=t.toCharArray();
           Arrays.sort(st);
           Arrays.sort(ts);
           return Arrays.equals(st,ts);
        

    }
}
