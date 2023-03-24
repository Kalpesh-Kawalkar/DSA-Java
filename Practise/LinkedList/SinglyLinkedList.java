package LinkedList;

import javax.xml.transform.Templates;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Method responsible for the creation of singly linked list
    public Node createSinglyLinkedList(int NodeValue) {
         head = new Node();
         Node node = new Node();
        node.next = null;
        node.value = NodeValue;
        head = node;
        tail = node;
        size = 1; // as it is a singly linked list
        return head;
    }

    // Insert method for SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }
        // at the beginning
        else if(location == 0) {
            node.next = head;
            head = node;
        }
        // at the end
        else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        // at any location
        else {
            Node tempnode = head;
            int index = 0;
            while(index < location - 1) {
                tempnode = tempnode.next;
                index++;
            }
            Node nextNode = tempnode.next;
            tempnode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traversal in Singly Linked List
    public void traverseSinglyLinkedList() {
        if(head == null) {
            System.out.println("Singly Linked List does not exist !");
        }
        else {
            Node tempnode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempnode.value);
                if(i != size - 1) {
                    System.out.print(" --> ");
                }
                tempnode = tempnode.next;
            }
        }
        System.out.println("\n");
    }

    // Searching a Node in a Singly linked list
    public boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.print("Found the Node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found !");
        return false;
    }

    // Deleting a node from a Singly Linked List
    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("Singly Linked List doesn't exist !");
            return;
        }
        else if (location == 0){
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
        }
        else if (location >= size) {
            Node tempNode = head;
            for(int i=0; i< size - 1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else {
            Node tempNode = head;
            for(int i=0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete Entire Singly Linked List
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The Singly Linked List is deleted successfully !");
    }
}