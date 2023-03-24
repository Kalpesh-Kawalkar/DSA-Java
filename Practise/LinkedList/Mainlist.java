package LinkedList;

public class Mainlist {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.createSinglyLinkedList(6);
        //System.out.println(obj.head.value);
        obj.insertInLinkedList(7, 1);
        obj.insertInLinkedList(8, 3);
        obj.insertInLinkedList(14, 4);
        obj.insertInLinkedList(16, 5);
        obj.traverseSinglyLinkedList();
        obj.searchNode(14);
        obj.searchNode(18);
        obj.deleteNode(3);
        obj.traverseSinglyLinkedList();
        //obj.deleteSLL();
        //System.out.println(obj.head.value);
    }
}