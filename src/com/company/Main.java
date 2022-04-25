package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	Holiday h = new Holiday("Unicorn Day");
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.getMonthValue());
    h.isToday(now.getMonthValue());
    h.setMonth(11);
    h.setDescription("Super glitter!");
    System.out.println(h.getDescription());
    }
}
