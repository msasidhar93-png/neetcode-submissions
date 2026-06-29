class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1 = s.toCharArray();
        Arrays.sort(a1);
        String s1 = new String(a1); 
        
        char[] a2 = t.toCharArray();
        Arrays.sort(a2);
        String t1 = new String(a2);

        if(s1.equals(t1)){
            return true;
        } 
        return false;
    }
}
