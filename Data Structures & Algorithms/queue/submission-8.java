class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class Deque {

    private Node dummyHead;
    private Node dummyTail;

    public Deque() {
        this.dummyHead = new Node(0);
        this.dummyTail = new Node(0);
        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }

    public boolean isEmpty() {
        return this.dummyHead.next == this.dummyTail;
    }

    public void append(int value) {
       Node newNode = new Node(value);
       if(this.dummyTail.prev != null){
       this.dummyTail.prev.next = newNode;
       }
        newNode.prev = this.dummyTail.prev;
        newNode.next = this.dummyTail;
        this.dummyTail.prev = newNode;
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        newNode.prev = this.dummyHead;
        newNode.next = this.dummyHead.next;
        this.dummyHead.next.prev = newNode;
        this.dummyHead.next = newNode;
    }

    public int pop() {
        if(this.isEmpty()){
            return -1;
        }else {
            Node popNode = this.dummyTail.prev;
             //System.out.println("Pop"+ this.dummyTail.prev.value);
            if(this.dummyTail.prev != null && this.dummyTail.prev.prev != null){
            this.dummyTail.prev.prev.next = this.dummyTail; 
            this.dummyTail.prev = this.dummyTail.prev.prev;
            }else {
                this.dummyHead.next = this.dummyTail;
            }
            return popNode.value;
        }
    }

    public int popleft() {
        if(this.isEmpty()){
            return -1;
        } else {
        Node popNode = this.dummyHead.next;
    
        if(this.dummyHead.next != null && this.dummyHead.next.next != null){
        this.dummyHead.next.next.prev = this.dummyHead;
        this.dummyHead.next = this.dummyHead.next.next;
        }else{
            this.dummyTail.prev = this.dummyHead;
        }
        System.out.println("Pop"+ this.dummyTail.prev.value);
        return popNode.value;
        }
    }
}
