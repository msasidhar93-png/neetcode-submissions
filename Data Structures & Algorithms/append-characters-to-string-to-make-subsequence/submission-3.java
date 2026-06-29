class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0,count = 0;
    while(i<t.length() && j<s.length()){
        if(s.charAt(j) == t.charAt(i)){
            count++;
            i++;
            j++;
        }else{
            j++;
        }
    }
    return t.length()-count;
}
}