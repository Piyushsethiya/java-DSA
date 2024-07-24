public class linked_list {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first, last
Node head;
    public void addFirst(String data) {
        
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void add(Node prev , String data) {
        
        Node newNode = new Node(data);
        System.out.println(prev);
        if (prev == null) {
            head = newNode;
            return;
        }
        prev.next= newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while( currNode.next != null){
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        Node currNode = list.head;
        list.add(null,"a");
        list.add( currNode,"is");
        list.addLast("last");

        Node copyHead = list.head;

        while (copyHead!=null) {
            System.out.println(copyHead.data+" ");
            copyHead=copyHead.next;
        }

    }
}