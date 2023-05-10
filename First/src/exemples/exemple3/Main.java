package exemples.exemple3;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.printf("%05d",a);
        System.out.printf("\n%5d", a);

        System.out.printf("\n%(5d",b);

        System.out.printf("\n%(5d",a);

        System.out.printf("\n%+5d",a);
        System.out.printf("\n%+5d",b);

        float c =123.45f ;
        float d =3.14f;
        System.out.printf("\n%6f",c);
        System.out.printf("\n%6.2f",c);
        System.out.printf("\n%06.2f",d);

        String str ="Java";

        System.out.printf("\n%20s",str);
        System.out.printf("\n%-20s",str);



    }
}
