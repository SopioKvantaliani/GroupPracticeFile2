package com.cydeo.linkedlList;

public class MySinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLInkedList myList = new MySinglyLInkedList();
        System.out.println(myList.isEmpty()); //returns true, because list is empty;


        for (int i = 0; i < 10; i++) {
            myList.add(i); //we add elements into our List
        }
            myList.printNodes();
            myList.deleteById(9);
            myList.printNodes();
            System.out.println("Index of 0"+myList.indexOf(0));

    }
}
