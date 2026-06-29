class DynamicArray {
    int capacity;
    int[] a;
    int length;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.a = new int[this.capacity];
    }

    public int get(int i) {
     return this.a[i];
    }

    public void set(int i, int n) {
        this.a[i] = n;
    }

    public void pushback(int n) {
       if(length == capacity){
        resize();
       }
       System.out.println(this.length);
       a[this.length] = n;
       length++;
    }

    public int popback() {
        if (length > 0) {
            // soft delete the last element
            length--;
        }
        return this.a[length];
    }

    private void resize() {
        capacity *= 2;
        int[] b = new int[capacity];
         for (int i = 0; i < length; i++) {
            b[i] = a[i];
        }
        a=b;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
