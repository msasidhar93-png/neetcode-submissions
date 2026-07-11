class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
            for(String str : strs){
                sb = sb.append(str.length()).append("#").append(str);
            }
            System.out.println("encode"+ sb.toString());
            return sb.toString();
    }

    public List<String> decode(String str) {
        int j =0;
        int i=0;
        List<String> decodeList = new ArrayList();
        while(j<=str.length()-1){
            i=j;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=i+1+str.substring(i,j).length();
            j=j+1;
            System.out.println(length);
            String s = str.substring(i,j+length);
            j = j+length;
             System.out.println("decode"+ s);
            decodeList.add(s);
        }
        return decodeList;
    }
}
