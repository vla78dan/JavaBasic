public class Types {
    public static void main(String[] args) {
        byte b = 127;
        //byte - 1байт -(-128  +127) 8битное целое число
        short s = 32767;
        //short - 2байта (-32 768  +32 767) короткое целое число
        int i = 2147483647;
        // int - 4байта (-2 147 483 648  +2 147 483 648) целое число
        long l = 32768;
        // long - 8байтов  (-9*1018 .. 9*1018) длинное целое число
        // Вещественный тип данных
        float f = 3.14f;
        double d = 3.14;
        //Символы
        char c = 'c';

        boolean bool = true;
    }
}

/*
Использование теоремы пифагора для нахождения длины гипотенузы по длинам двух катетов
 */

class Hypothesis {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println("Длина гипотенузы = " + z);
    }
}


class Inches {
    public static void main(String[] args) {
        long cci;
        long im;
        im = 5280 * 12;
        cci = im * im * im;
        System.out.println("В кубической миле содержится " + cci + " кубических дюймов");
    }
}