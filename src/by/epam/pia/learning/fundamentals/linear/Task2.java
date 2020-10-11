package by.epam.pia.learning.fundamentals.linear;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+ Math.pow(b,-2)

public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double result;

        int len = args.length;

        if (len < 1) {
            a = 2;
        } else {
            a = Double.parseDouble(args[0]);
        }

        if (len < 2) {
            b = 4;
        } else {
            b = Double.parseDouble(args[1]);
        }

        if (len < 3) {
            c = 1.0;
        } else {
            c = Double.parseDouble(args[2]);
        }

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        result = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+ Math.pow(b,-2);
        System.out.println("Result=" + result);
    }
}
