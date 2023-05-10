package exemples.exemple2;

public class Main {
    public static void main(String[] args) {
        int x=10;
        float y=12.55f;
        char z ='A';
        String str="Java Program";
        System.out.printf("Hello");

        System.out.printf("Hello %d %f %c World \n",x,y,z);
        System.out.printf("Hello %e \n",y);
        System.out.printf("Hello %s", str);

        System.out.printf("\n%3$s %2$f %1$d", x,y,str);

    }
}
