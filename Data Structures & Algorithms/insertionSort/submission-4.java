// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
            int length = pairs.size();
            List<List<Pair>> pairList = new ArrayList<>();
            int count = 0;
            if(length >0){
            pairList.add(new ArrayList<>(pairs));
            }
            for(int i = 1; i<length; i++){
                int j = i-1;
                while(j>=0){
                    if(pairs.get(j+1).key < pairs.get(j).key){
                    Pair tempPair = pairs.get(j);
                    pairs.set(j, pairs.get(j+1));
                    pairs.set(j+1, tempPair);
                    }
                    j--;
                } 
                pairList.add(new ArrayList<>(pairs));   
            }    
            return pairList;
    }
}
