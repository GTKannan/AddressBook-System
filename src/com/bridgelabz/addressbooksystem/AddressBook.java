package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    // Contact fields
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    // Method to take input from user
    public void createContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter City: ");
        city = scanner.nextLine();

        System.out.print("Enter State: ");
        state = scanner.nextLine();

        System.out.print("Enter Email: ");
        email= scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        phoneNumber = scanner.nextLong();

        System.out.print("Enter ZIP: ");
        zip = scanner.nextInt();

        scanner.close();
    }

    // Method to display contact info
    public void displayContact() {
        System.out.println("\nContact Details:");
        System.out.println("Name      : " + firstName + " " + lastName);
        System.out.println("Address   : " + address);
        System.out.println("City      : " + city);
        System.out.println("State     : " + state);
        System.out.println("ZIP       : " + zip);
        System.out.println("Phone     : " + phoneNumber);
        System.out.println("Email     : " + email);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook contact = new AddressBook();
        contact.createContact();
        contact.displayContact();
    }
}