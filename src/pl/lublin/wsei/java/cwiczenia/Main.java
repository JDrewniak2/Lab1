package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        double c;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);
        System.out.printf("Nazwaliśmy to "+"witaminą B3");
        System.out.printf("alfa/tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        for (int j = 1; j < 100; j = j * 2)
            System.out.printf("%d\t%f\t%s\n", j, c = Math.log(j) / Math.log(2), c + j );
    }
}
