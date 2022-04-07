package com.company;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

class Zad5 {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Lokalny czas to :");
        System.out.println(now.toString());
        System.out.println("Globalny czas to :");
        System.out.println(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
    }


}
