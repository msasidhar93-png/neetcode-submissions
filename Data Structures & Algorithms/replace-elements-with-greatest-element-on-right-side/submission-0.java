class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
                int temp = 0;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]> temp){
                        temp = arr[j];
                    }
                }
                if(i < arr.length-1){
                    newArr[i] = temp;
                }else{
                    newArr[i] = -1;
                }
                
            
        }
        return newArr;
    }
}