package LinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularLinkedList(int NodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = NodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createCircularLinkedList(nodeValue);
            return;
        }
        // Insertion at the beginning
        else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = node;   
        }
        // Insertion at the end
        else if(location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        // Insertion at a specified location
        else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal Method
    public void traverseCSLL() {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
                }
                System.out.print("\n");
            }
            else {
                System.out.println("\nCircular Singly Linked List does not exist");
        }
    }
    // Searching a node
    public boolean searchCSLL(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("Found node at location " + i);
                    return true;
                }
                tempNode = tempNode.next ;
            }
        }
        System.out.println("Node not found !");
        return false;
    }

    // Deletion method
    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("The CSLL does not exist");
            return;
        }
        else if(location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        }
        else if(location >= size) {
            Node tempnode = head;
            for(int i=0; i<size-1; i++) {
                tempnode = tempnode.next;
            }
            if(tempnode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempnode.next = head;
            tail = tempnode;
            size--;
        }
        else {
            Node tempnode = head;
            for(int i=0; i<location-1; i++) {
                tempnode = tempnode.next;
            }

            tempnode.next = tempnode.next.next;
            size--;
        }
    }

    // Deleting entire CSLL
    public void deleteCSLL() {
        if(head == null) {
            System.out.println("The CSLL does not exist");
        }
        else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted succesfully !");
        }
    }
}