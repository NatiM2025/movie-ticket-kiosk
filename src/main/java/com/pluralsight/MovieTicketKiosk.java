package com.pluralsight;

import java.util.Scanner;

public class MovieTicketKiosk {
    public static void main(String[] args) {
        System.out.println("====> Welcome to the movie Ticket kiosk! <====");
        // Customer details, typed in by hand for now
        String customerName = "Maya";
        String dayOfWeek = "Tuesday";
        int age = 34;
        int ticketCount = 3;
        boolean isMember = true;

        // Prices
        double basePrice = 12.00;
        double dayDiscount = 3.00;
        final double SERVICE_FEE = 1.50;

        // price per ticket after the day discount
        double ticketPrice = basePrice - dayDiscount;
        double subtotal = ticketPrice * ticketCount;
        double memberDiscount = 0.00;
        double total = subtotal - memberDiscount + SERVICE_FEE;

        System.out.println("Ticket price: " + ticketPrice);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);

    }
}
