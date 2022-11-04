/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */
public class LinkList {
    /** This is the only field of the class. It holds the head of the list */
        ListNode head;

       /** Length of the linked list. */
        private int length;
    
       /** This class has a default constructor: */
       public LinkList() {
           length = 0;
       }
       
         public  void insertAtBegin(int data) {
            ListNode node=new ListNode();
            node.next=head;
            node.data=data;
            head = node;
            length++;
        }
       public  void insertAtEnd(int data) {
           ListNode node=new ListNode(data);
           node.next=null;
                   
      
            if (head == null) {
               head = node;
           } else {
                 ListNode temp;
                 temp=head;
                while (temp.next != null) {
                  temp = temp.next;
                }
           //     node=new ListNode(data);
                temp.next=node;
        
            }
            
           length++;
        }  
       
       
       public void insert(int data, int position) {
        // fix the position
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
             position = length;
        }

        // if the list is empty, make it be the only element
        if (head == null) {
             head = new ListNode(data);
        }
        // if adding at the front of the list...
        else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        }
        // else find the correct position and insert
       else {
            ListNode temp = head;
            for (int i = 1; i < position; i += 1) {
                 temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next=newNode;
           }
           // the list is now one value longer
           length += 1;
     }
               @Override
    public String toString() {
        String result = "[";
        if (head == null) {
             return result + "]";
        }
        result = result + head.data;
        ListNode temp = head.next;
        while (temp != null) {
             result = result + "," + temp.data;
             temp = temp.next;
        }
        return result + "]";
    }
         
            public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertAtBegin(10);
        linkList.insertAtBegin(20);
        linkList.insertAtBegin(30);
        linkList.insertAtBegin(40);
        linkList.insertAtEnd(778);
        
        System.out.println(""+linkList);
            }
}
