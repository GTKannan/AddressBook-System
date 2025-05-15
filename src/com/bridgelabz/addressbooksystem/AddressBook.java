package com.bridgelabz.addressbooksystem;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

class ContactPerson {
    // Contact fields
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public ContactPerson(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Method to display contact info
    public void displayContactDetails() {
        System.out.println("\nContact Details:");
        System.out.println("Name      : " + firstName + " " + lastName);
        System.out.println("Address   : " + address);
        System.out.println("City      : " + city);
        System.out.println("State     : " + state);
        System.out.println("ZIP       : " + zip);
        System.out.println("Phone     : " + phoneNumber);
        System.out.println("Email     : " + email);
    }

}

public class AddressBook {

    ArrayList<ContactPerson> contacts = new ArrayList<>();

    // Method to take input from user
    public void createContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email= scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();

        System.out.print("Enter ZIP: ");
        int zip = scanner.nextInt();

        ContactPerson person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
        AddressBook book=new AddressBook();
        this.addContact(person);
    }


    public void addContact(ContactPerson contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!\n");
    }

    // Display all contacts
    public void displayContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (ContactPerson contact : contacts) {
                contact.displayContactDetails();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook contact = new AddressBook();
        contact.createContact();
        contact.displayContact();
    }
}