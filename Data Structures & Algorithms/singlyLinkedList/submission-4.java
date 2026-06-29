class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}


class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        Node cur = head.next;
        int i= 0;
        while(cur !=null){
            if(index == i){
                return cur.data;
            }
            cur = cur.next;
            i++;
        }
        return -1;
        
    }

    public void insertHead(int val) {
       Node ln = new Node(val);
       ln.next = head.next;
       head.next = ln;

       if(ln.next == null){
        tail = ln;
       }
    }

    public void insertTail(int val) {
        tail.next = new Node(val);
       this.tail = tail.next;
       
    }

    public boolean remove(int index) {
        int i = 0;
        Node curr = head;

        while(i<index && curr != null){ 
            curr = curr.next;
            i++;
        }
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
    ArrayList<Integer> res = new ArrayList<>();
        Node curr = this.head.next;
        while (curr != null) {
             System.out.println("curr.data" +curr.data);
            res.add(curr.data);
            curr = curr.next;
        }
        return res;
    }
}
