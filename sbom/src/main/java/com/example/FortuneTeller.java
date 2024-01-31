package com.example;

import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {

    private static String getFortune() {
        String[] fortunes = {
                "You will find great failure in the near future.",
                "Expect the unexpected. A shocking nightmare is on the way.",
                "Take a moment to reflect on the beauty around you. Cause you are not",
                "A new opportunity will present itself soon and you would miss it, as always !",
                "Your creativity will be your greatest asset in the coming days. You can dream of a wonderful life while living a miserable one",
                "Good things come to those who deserve it; not to you.",
                "Today is a good day to try something new. Try not ruining others day by showing up",
                "Your positive attitude will attract positive outcomes. In your dreams not in reality",
                "Trust your instincts; they will guide you well into the depts of hell",
                "Embrace change, for it is the only constant in life for people who can't succeed in anything"
        };
        Random random = new Random();
        return fortunes[random.nextInt(fortunes.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fortune Teller App!");
        System.out.print("Would you like to know your future? (yes/no): ");
        
        String userResponse = scanner.nextLine().toLowerCase();

        if (userResponse.equals("yes")) {
            String fortune = getFortune();
            System.out.println("\nYour Fortune: " + fortune);
        } else if (userResponse.equals("no")) {
            System.out.println("Future is for the living, not the walking Dead !!!");
        } else {
            System.out.println("Invalid response. Please enter 'yes' or 'no'.");
        }
    }
}

