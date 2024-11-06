public class Main {
    public static void main(String[] args)
    {
        char ch='z';
        System.out.println("Litera este:\n "  + ch);

        int age = 20;
        System.out.println("Vartsa este " + age +" ani");

        String name = "Marian";
        age = 25;
        System.out.println("Numele meu este " + name +" si am varsta de " + age + "\n" + "Acesta am fost eu!");
        double pret = 400.43;
        char dolar ='$';
        System.out.println("Pretul iphone este " + pret + dolar);
        System.out.println("Pretul iphone este " + pret + '$');
        boolean adevar = age>0;
        System.out.println("Conditia este " + adevar);
        int temperatura = -10;
        boolean stareTemperatura = temperatura>0;
        System.out.println("Temperatura este pozitiva " + stareTemperatura);
    }
}