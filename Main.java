public class Main {

    public static void main (String[] args) {

        // Double / Float  Ondalıklı Sayılar

        //Double  virgülden sonra fazla sayı var floata göre. daha dogru sonucu verir.

        double a = 5.25;

        double b = 4.0;

        double c = 4d;

        double d = 4.23d;
        System.out.println(c);

        //Float

        float t = 5f;
        float o = 5.25f;
        float p = (float)5.0;


        int x = 22/7;
        float y = 22f / 7f;
        double z = 22d / 7d;

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

        // Otomatik dönüştürme  :  int --> float --> double

        int l = 5;
        float h = l;

        System.out.println(h);

        double f = 3.52;
        float w = ( float) f;


        double number1 = 70.25;
        double number2 = 60d;
        double number3 = 80.2;

        System.out.println("Ortalama:" + ( number1 + number2 + number3) / 3 );

        float number4 = 70.25f;
        float number5 = 60f;
        float number6 = 80.2f;

        System.out.println("Ortalama2:" + ( number4 + number5 + number6) / 3 );





    }
}
