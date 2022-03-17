package com.infogalaxy;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    public void addContact(){
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
    }
    public void displayContact(){
        System.out.println(contact.toString());
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
    }
}
