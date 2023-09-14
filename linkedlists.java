import java.util.*;
class linkedlists{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(" Areeb");
        ll.add("akjdn");
        ll.add("jfnej");
        ll.printList();
        
    }
}
class node{
    int data;
    node next;

public node(int data){
    this.data = data;
    this.next=null;
}
}
class linkedlist{
    node head;
 public linkedlist(){
    this.head=null;
}
//add new node at end
public void append(int data){
node Newnode = new node(data);
    if(head==null){
        head= Newnode ;
        return;
    }
    node curr = head;
    while(curr.next!=null){
        curr = curr.next;

    }
    curr.next=Newnode;
}
//prinrt linkedlist
    public void printList(node head){
        node curent = head;
        while(curent !=null){
            System.out.println(curent.data + " ");
            curent = curent.next;
        }
        System.out.println();
    }
}

