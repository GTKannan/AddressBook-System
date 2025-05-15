package com.bridgelabz.addressbooksystem;

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

    public void editContactByName(String name) {
        Scanner scanner= new Scanner(System.in);
        for (ContactPerson contact : contacts) {
            if (contact.firstName.equalsIgnoreCase(name)) {
                System.out.println("Contact found. Enter new details:");

                System.out.print("Enter First Name: ");
                contact.firstName = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                contact.lastName = scanner.nextLine();

                System.out.print("Enter Address: ");
                contact.address = scanner.nextLine();

                System.out.print("Enter City: ");
                contact.city = scanner.nextLine();

                System.out.print("Enter State: ");
                contact.state = scanner.nextLine();

                System.out.print("Enter Email: ");
                contact.email = scanner.nextLine();

                System.out.print("Enter Phone Number: ");
                contact.phoneNumber = Long.parseLong(scanner.nextLine());

                System.out.print("Enter ZIP: ");
                contact.zip = Integer.parseInt(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact with the given name not found.");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\nMenu:\n1. Add Contact\n2. Display Contacts\n3. Edit Contact\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    book.createContact();
                    break;
                case 2:
                    book.displayContact();
                    break;
                case 3:
                    System.out.print("Enter First Name of Contact to Edit: ");
                    String name = scanner.nextLine();
                    book.editContactByName(name);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}