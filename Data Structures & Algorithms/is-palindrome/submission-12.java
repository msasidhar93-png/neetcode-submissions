class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length()-1;
        boolean val = true;
        while(r>0 && l<=r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else{
                if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                    System.out.println("l" + s.charAt(l) + "r"+ s.charAt(r));
                    l++;
                    r--;
                }else{
                    System.out.println("l" + s.charAt(l) + "r"+ s.charAt(r));
                   return false;
                }
            }

        }
        return val; 
    }
}
