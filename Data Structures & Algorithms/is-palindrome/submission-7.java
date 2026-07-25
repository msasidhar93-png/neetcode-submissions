class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
        boolean result = false;
        if(s.length()<=1){
            result = true;
        }
        while(i<j && s.length()>1){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                System.out.println("i"+ i + s.charAt(i)+ "j"+ j + s.charAt(j));
                result = true;
                i++;
                j--;
            }else{
                System.out.println("i"+ i + s.charAt(i)+ "j"+ j + s.charAt(j));
                return false;
            }

        }
        return result;
    }
}
