package com.company;

public class Main {

    public static void main(String[] args) {
	String [] flights = {"AY664" , "BA047", "AF110", "LH554", "AF003", "BA116", "AY101"};
	String [] airlines = {"AY", "UA", "LH"};

        System.out.println("flights: ");
	for (String f : flights)
        System.out.print(f + " "); //f is copied from flights, thus it prints the flights
        System.out.println();

        System.out.println("airlines: ");
	for (String a : airlines)
        System.out.print(a + " ");
        System.out.println();

    for (String a : airlines) {
        System.out.print(a + ": ");
        for (String f : flights)
            if (f.startsWith(a))
                System.out.print(f + " ");
        System.out.println();
    }

    }
}