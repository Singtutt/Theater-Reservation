package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  Prompt the user for their full name
        System.out.print("Please enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();

//  Prompt the user for the date of the show
        System.out.print("What date will you be attending (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);

//  Prompt the user for the number of tickets
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

//  Format the reservation confirmation message with MM/dd/yyyy date format
        String formattedDate = date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String[] nameParts = fullName.split(" ");
        String lastName = nameParts[nameParts.length - 1];
        String firstName = nameParts.length > 1 ? nameParts[0] : "";

        System.out.print(numTickets + " ticket" + (numTickets > 1 ? "s" : "") + " reserved for " + formattedDate +
                " under " + lastName + ", " + firstName);

        scanner.close();
    }
}