package com.cydeo.linkedlList;

import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        DemoClass cl = new DemoClass();
        System.out.println(cl);

        System.out.println("-------------------------------------");

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        node1.next = node2; //node1 points to node2 and so on;
        node2.next = node3;
        node3.next = node4;
        System.out.println("Node1's address is: "+node1.id+". Node1' next address is "+ node1.next);
        System.out.println("Node1's address is: "+node2.id+". Node1' next address is "+ node2.next);
        System.out.println("Node1's address is: "+node3.id+". Node1' next address is "+ node3.next);
        System.out.println("Node1's address is: "+node4.id+". Node1' next address is "+ node4.next);

        Node current;
        Node head = node1;
        current = head; //current referring to "head",

        while (current!=null){
            System.out.println("Id of node is: "+current.id);
            current=current.next; //last element equals null and loop terminates
        }

   System.out.println("--------------------------------------------------");




    }
}
