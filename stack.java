import java.lang.classfile.components.ClassPrinter.Node;

public class stack {
    static class node {
        int data;   
        Node next;
        public node(int data){
            this.data = data;
            next = null;
        }
        
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            // Node newNode = new node(data);
            if(isEmpty()){
                // head = newNode;
                return;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
