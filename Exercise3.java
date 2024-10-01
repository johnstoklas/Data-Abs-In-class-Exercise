public class Exercise3 {
    public class LinkedList {
        private int size;
        private Node head;

        public LinkedList() {
            this.size = 0;
            this.head = null;
        }

        public String get(int index) {
            int count = 0;
            Node curr = head;
            while(count != index) {
                curr = curr.next;
                count++;
            }
            return curr.item;
        }
        
        public void set(int index, String val) {
            int count = 0;
            Node curr = head;
            while(count != index) {
                curr = curr.next;
                count++;
            }
            curr.item = val;
        }
        
        public void add(String val) {
            Node curr = head;
            while(curr.next != null) {  
                curr = curr.next;
            } 
            Node add = new Node(null, val);
            curr.next = add;
        }
        
        public void insert(int index, String val) {
            Node curr = head;
            int count = 0;
            Node insert = new Node(null, val);
            while(count != index) {
                curr = curr.next;
                count++;
            }
            Node tmp = curr.next;
            curr.next = insert;
            insert.next = tmp;
        }
        
        public void remove(int index) {
            Node curr = head; 
            int count = 0;
            while(count != index) {
                curr = curr.next;
                count++;
            }
            curr.next = curr.next.next;
        }
        
        public boolean find(String val) {
            Node curr = head;
            while(curr != null) {
                if(curr.item.equals(val)) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
    }

    public class Node {
        public Node next;
        public String item;

        public Node(Node next, String item) {
            this.next = next;
            this.item = item;
        }        
    }


    
}



