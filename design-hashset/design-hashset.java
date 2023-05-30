class Node{
    int key;
    Node next;
    public Node(int key){
        this.key=key;
    }
}

class MyHashSet {
     Node[] buckets;
    int capacity;

    public MyHashSet() {
        capacity=10000;
        buckets=new Node[capacity];
    }

    public int getIndex(int key){
        return key%capacity;
    }
    
    public void add(int key) {
        int index=getIndex(key);
        Node newNode=new Node(key);

         if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
           
            Node current = buckets[index];
            while (current.next != null) {
                
                if (current.key == key) {
                    return;  
                }
                current = current.next;
            }
           
            if (current.key == key) {
                return; 
            }
            current.next = newNode;
    }
    }
    
    public void remove(int key) {
          int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;

       
        while (current != null) {
           
            if (current.key == key) {
               
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                   
                    prev.next = current.next;
                }
                return; 
            }
            prev = current;
            current = current.next;
        }
    }
    
    public boolean contains(int key) {
         int index = getIndex(key);
        Node current = buckets[index];

      
        while (current != null) {
         
            if (current.key == key) {
                return true;  
            }
            current = current.next;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */