package by.epam.pia.learning.fundamentals.linear;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);

public class Task3 {

    public static void main(String[] args) {
        double x;
        double y;
        double result;

        int len = args.length;

        if (len < 1) {
            x = 2;
        } else {
            x = Double.parseDouble(args[0]);
        }

        if (len < 2) {
            y = 4;
        } else {
            y = Double.parseDouble(args[1]);
        }


        System.out.println("x=" + x);
        System.out.println("y=" + y);

        result= (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("Result=" + result);
    }
}
