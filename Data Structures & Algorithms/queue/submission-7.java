class Deque {
     private  Node dummyhead;
     private  Node dummytail;
    public Deque() {
        this.dummyhead = new Node(0);
        this.dummytail = new Node(0);
        this.dummyhead.next = this.dummytail;
        this.dummytail.prev = this.dummyhead;
    }

    public boolean isEmpty() {
        if(this.dummyhead.next == this.dummytail){
            return true;
        }
        return false;
    }

    public void append(int value) {
       Node append = new Node(value);
       this.dummytail.prev.next = append;
       append.prev = this.dummytail.prev;
       append.next = this.dummytail;
       this.dummytail.prev = append;
    }

    public void appendleft(int value) {
        Node appendLeft = new Node(value);
        appendLeft.next = this.dummyhead.next;
        appendLeft.prev = this.dummyhead;
        this.dummyhead.next.prev = appendLeft;
        this.dummyhead.next = appendLeft;
        
    }

    public int pop() {
        boolean isEmpty = this.isEmpty();
        int val1 = this.dummytail.prev.value;
       
        if(!isEmpty){
        int val = this.dummytail.prev.value;
        if(this.dummytail.prev.prev != this.dummyhead){
        System.out.println("val" + val1 + "isEmpty" + isEmpty);
        this.dummytail.prev.prev.next = this.dummytail;
        this.dummytail.prev = this.dummytail.prev.prev;
        }else{
            this.dummytail.prev = this.dummyhead;
            this.dummyhead.next = this.dummytail;
        }
        return val;
        }
        return -1;
    }

    public int popleft() {
       boolean isEmpty = this.isEmpty();
        if(!isEmpty){
        int val = this.dummyhead.next.value;
        this.dummyhead.next.next.prev = this.dummyhead;
        this.dummyhead.next = this.dummyhead.next.next;
        return val;
        }
        return -1;
    }
}

class Node{
int value;
Node next;
Node prev;

public Node(int val){
    this.value = val;
    this.next = null;
    this.prev = null;
}
}
