package Java.LinkedList;

public class LinkedList {
    
    //Create a Node class
    Node head;

    private int size; //To store the size of linked list

    LinkedList(){
        this.size = 0;
    }

    class Node {
        int data; //data is the value that your node will store
        Node next; //next is the pointer that will point to the next node

        //Node Constructor
        Node(int data){
            this.data = data; 
            this.next = null;
            size++;
        }
    }

    //Function to add an element at the beginning of the linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Function to add an element at the last of the linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Function to print the linked list
    public void printList(){
        if(head == null){
            System.out.println("No data is present in the linked list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //Function to delete the first node from the linked list
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Function to delete the last node from the linked list
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null ){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
    }

    //Function to get the size of the Linked list
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(5);
        list.addLast(10);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        int size = list.getSize();
        System.out.println(size);
    }
}
