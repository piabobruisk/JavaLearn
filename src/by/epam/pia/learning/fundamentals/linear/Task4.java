package by.epam.pia.learning.fundamentals.linear;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

    public static void main(String[] args) {
        double x;
        double result;

        int len = args.length;

        if (len < 1) {
            x = 123.456;
        } else {
            x = Double.parseDouble(args[0]);
        }

        System.out.println("x=" + x);
        int integral = (int) x;
        double fractional = x - integral;

        result = fractional * 1000 + integral / 1000d;
        System.out.print("Result=");
        System.out.printf("%.3f", result);
    }
}
