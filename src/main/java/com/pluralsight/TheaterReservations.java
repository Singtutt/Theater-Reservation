package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  Prompt user for their full name
        System.out.print("Please enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();

//  Prompt user for the date of the show
        System.out.print("What date will you be attending (MM/dd/yyyy): ");
        String showDate = scanner.nextLine();

//  Prompt user for the number of tickets needed
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

//  Close the scanner
        scanner.close();

//  Prepare the confirmation message
        String pluralSuffix = numTickets == 1 ? "" : "s";
        String confirmationMessage = numTickets + " ticket" + pluralSuffix + " reserved for " + showDate + " under " + fullName;

//  Display the confirmation message
        System.out.println(confirmationMessage);
    }
}