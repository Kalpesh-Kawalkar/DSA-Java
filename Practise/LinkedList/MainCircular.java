package LinkedList;

class MainCircular {
    public static void main(String[] args) {
        CircularSinglyLinkedList obj = new CircularSinglyLinkedList();
        //obj.createCircularLinkedList(5);
        obj.insertCSLL(6, 0);
        obj.insertCSLL(7, 1);
        obj.insertCSLL(8, 2);
        obj.insertCSLL(9, 3);
        obj.insertCSLL(10, 4);
        obj.traverseCSLL();
        obj.searchCSLL(11);
        obj.deleteNode(0);
        obj.traverseCSLL();
        obj.deleteCSLL();
        obj.traverseCSLL();
        //System.out.println(obj.head.value);
    }
}