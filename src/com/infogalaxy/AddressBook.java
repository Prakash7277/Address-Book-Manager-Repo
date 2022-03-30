package com.infogalaxy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public void editContact(){
        int check = 0;
        int i;
        System.out.println("Enter Search Name :");
        String FName = sc.next();
        for( i=0; i<contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (FName.equals(contact.getFistName())) {
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Name Is Not Found :");
        } else {
            Contact contact = contactlist.get(i);
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

    }public void findState() {
        System.out.println("Enter The State :");
        String stateName = sc.next();
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (stateName.equals(contact.getState())) {
                System.out.println(contact.getFistName());
                System.out.println(contact.getMobNo());
            }
        }
    }
    public void deleteContact() {
        System.out.println("Enter the Fist Name :");
        String delete = sc.next();
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (delete.equals(contact.getFistName())) {
                contactlist.remove(i);
            }
        }
    }
    public void backupToFile(){
        String conData=null;
        for(int i = 0; i < contactlist.size(); i++){
            Contact contact = contactlist.get(i);
            conData = contact.getFistName()+","+ contact.getLastName()+","+contact.getMobNo()+
                    ","+contact.getAddress()+","+contact.getAddress()+","+contact.getCity()+","
                    +contact.getState()+","+contact.getEmail()+","+contact.getZip()+"\n"+conData;
        }
        try {
            Path file = Paths.get("MyData.txt");
            byte[] filedata = conData.getBytes();
            Files.write(file,filedata);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("*** CONTACT INVENTORY MANAGEMENT***");
            System.out.println("1. ADD CONTACT\n2. DISPLAY CONTACT\n3. Edit Contact :\n" +
                    "4. find The State\n5. Delete Contact\n6. Backup To File\n7. Exit");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.findState();
                    break;
                case 5:
                    addressBook.deleteContact();
                    break;
                case 6:
                    addressBook.backupToFile();
                    break;
            }
        }while(choice != 7);
    }
}

