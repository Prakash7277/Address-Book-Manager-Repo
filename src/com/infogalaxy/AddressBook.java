package com.infogalaxy;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact>  contactlist = new ArrayList();
    public void addContact(){
        Contact contact = new Contact();
        System.out.println("Enter the First Name : ");
        contact.setFistName(sc.next());
        System.out.println("Enter The Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter The Mobile No : ");
        contact.setMobNo(sc.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter The City : ");
        contact.setCity(sc.next());
        System.out.println("Enter The State : ");
        contact.setState(sc.next());
        System.out.println("Enter The Email ID : ");
        contact.setEmail(sc.next());
        System.out.println("Enter The Zip : ");
        contact.setZip(sc.next());
        contactlist.add(contact);
    }
    public void displayContact(){
        for(int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            System.out.println(contact.toString());
        }
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("*** CONTACT INVENTORY MANAGEMENT***");
            System.out.println("1. ADD CONTACT\n2. DISPLAY CONTACT\n3. EXIT");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
            }
        }while(choice != 3);
    }
}

