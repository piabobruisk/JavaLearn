package by.epam.pia.learning.fundamentals.linear;

// 6. Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

import java.util.Random;

public class Task6 {

    public static void main(String[] args){
     int x;
     int y;

     x=new Random().nextInt(10)-5;
     y=new Random().nextInt(10)-5;
     System.out.println("x="+x +" y="+ y);
     System.out.println((x>=-4 && x<=4) && (y>=-3 && y<=0) || ((x>=-2 && x<=2)&& (y>=0 && y<=4)) );
    }
}
