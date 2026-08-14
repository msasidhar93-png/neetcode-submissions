class Solution {
    public boolean isValid(String k) {
        Stack<Character> s = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for(char c : k.toCharArray()){
            if(closeToOpen.containsKey(c)){
            if(!s.isEmpty() && s.peek() == closeToOpen.get(c)){
                s.pop();
            }else{
                return false;
            }
            }else{
                s.push(c);
            }
        }

        return s.isEmpty();
    }
}
