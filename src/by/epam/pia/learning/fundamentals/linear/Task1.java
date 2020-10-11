package by.epam.pia.learning.fundamentals.linear;

//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c

public class Task1 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        int len = args.length;

        if (len < 3) {
            c = 1.0;
        } else {
            c = Double.parseDouble(args[2]);
        }
        if (len < 2) {
            b = 4;
        } else {
            b = Double.parseDouble(args[1]);
        }
        if (len < 1) {
            a = 2;
        } else {
            a = Double.parseDouble(args[0]);
        }

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        z = ((a - 3) * b / 2) + c;
        System.out.println("z=" + z);
    }
}
