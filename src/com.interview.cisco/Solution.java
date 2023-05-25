/**
 LinkedList is given below 
  1 --> 2--> 3--> 4--> 5    and K=2 
  Swap the Kth element and Kth Last element 
  for example , 2nd elemenet and 2nd last element. 
  
 * @author Addula Umamahesh
 *
 */
public class Solution {
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    //printLinkedList(head);

    movetoK(head,2);
  printLinkedList(head);

  }
  /*
  x=temp; 
  x=y
  y=temp */

  public static void movetoK(Node head, int K) {
     Node x = head;
     Node y= head; 
     Node kprev = null ;
     Node yprev = null; 
     Node knode = null ; 
    int count = 0; 
    while(++count < K) {
    	kprev = x;
    	x = x.next;
    }
    knode =x;
    
     while(x.next !=null ) {
        x =x.next;
        yprev = y;
        y = y.next;
     }
     
    
     
     // Swapping .. 
     Node temp = y.next ;
     kprev.next = y ;
     y.next = knode.next ;
     yprev.next = knode ; 
     knode.next = temp ; 
    
   
   }


  public static void printLinkedList(Node head){
    Node temp = head;
    while (temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}

class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
