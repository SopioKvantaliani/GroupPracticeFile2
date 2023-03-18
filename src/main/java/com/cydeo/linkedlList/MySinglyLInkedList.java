package com.cydeo.linkedlList;

import com.sun.source.tree.WhileLoopTree;

public class MySinglyLInkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
      return head==null; //if head is null, that is we don't have any elements in the list
    }

    void add(int data){
        //create a new object from data;
        Node node = new Node(data);
        if (isEmpty()){ //if the list is empty
         head=tail=node;
         size++; //increase size of the list
        }else { //if there are elements in list
            tail.next=node;
            tail=node;
            size++; //increase size of the list
        }
    }

    void deleteById (int id){
        //check if empty
        //assign prev and current with the head;
        if (isEmpty()) System.out.println("List is empty!!!");
        Node prev = head;
        Node current = head;

        while (current != null){
            if (current.id==id){ //there is a match
                   //case1: head
                if (current==head){
                    head=current.next; //
                    current.next=null;//head is gone and we updated new head value;
                }
                    //case2: tail

                else if (current==tail){
                    tail=prev;
                    prev.next=null; //ex tail will be eligible for Garbage collection
                }
                    //case3: middle

                else {
                    prev.next = current.next; //so middle element's place will be referenced to current.next.
                    current.next = null; // Current will be eligible for Garbage collection
                }

                //after deletion
                size --; //if we succeed we need to decrease size.
            }

            //move forward on the element of the list
            prev= current;
            current = current.next;
        }

    }

    int indexOf(int id){

        if (isEmpty()){
            return -1;
        }

        int position= 0;
        //iterate through the list
        Node current = head; // set my current with the starting element;
        while (current!=null){

            if (current.id==id) return position; //if true will return index 0
            position++; //increase position if this is not the case;
            current = current.next; //moves us to the next element;
        }
        return -1;
    }


    void printNodes (){
        Node current = head;
        while (current !=null){
            if (current.next==null){
                System.out.println(current.id+"=> null");
            }else {
            System.out.print(current.id+"=> ");

        }
            current=current.next;
       }
    }
}
