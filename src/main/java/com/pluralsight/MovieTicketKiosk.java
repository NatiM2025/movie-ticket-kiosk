package com.pluralsight;

public class MovieTicketKiosk {
    public static void main(String[] args) {
        System.out.println("====> Welcome to the movie Ticket kiosk! <====");
        // Customer details, typed in by hand for now
        String customerName = "Maya";
        String dayOfWeek = "Tuesday";
        int age = 34;
        int ticketCount =3;
        boolean isMember = true;

        // Prices
        double basePrice = 12.00;
        double dayDiscount = 3.00;
        final double SERVICE_FEE = 1.50;

        // Check the Values
        System.out.println("customer: " + customerName);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Member: " + isMember);
        System.out.println("Base price: " + basePrice);

    }
}
