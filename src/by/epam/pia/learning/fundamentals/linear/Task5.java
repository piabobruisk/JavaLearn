package by.epam.pia.learning.fundamentals.linear;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//
//ННч ММмин SSc.

import java.util.Random;

public class Task5 {

    public static void main (String[] args){

        int t = new Random().nextInt(359999);
        System.out.println("T="+t);

        int seconds = t%60;
        t = (t-seconds)/60;
        int minutes = t%60;
        int hours = (t-minutes)/60;

        System.out.println(hours+" ч "+ minutes+" мин "+seconds+" сек.");

    }
}
