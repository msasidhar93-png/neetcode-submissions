class MinStack {
        private Stack<Integer> s;
        private Stack<Integer> mins;

    public MinStack() {
         s = new Stack<>();
         mins = new Stack<>();
    }
    
    public void push(int val) {
        if (mins.isEmpty() || val <= mins.peek()) {
            mins.push(val);
        }
        this.s.push(val);
    }
    
    public void pop() {
        if(!mins.isEmpty() && mins.peek().equals( s.peek())){
            mins.pop();
        }
        this.s.pop();
    }
    
    public int top() {
      return  this.s.peek();
    }
    
    public int getMin() {
       return this.mins.peek();
    }
}
