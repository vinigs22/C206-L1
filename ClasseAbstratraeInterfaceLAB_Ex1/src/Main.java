public class Main {

    public static void main(String[] args) {

        SUV suv = new SUV(220, "Preto", 2019, "4x4");
        Sedan sedan = new Sedan(125, "Branco", 2007, 500);
        Hatch hatch = new Hatch(80, "Prata", 2015, 4);

        System.out.println("--------Valor sem juros--------");

        suv.mostraInfo();
        sedan.mostraInfo();
        hatch.mostraInfo();

        suv.taxa();
        sedan.taxa();
        hatch.taxa();

        System.out.println("--------Valor após aplicar os juros--------");

        suv.mostraInfo();
        sedan.mostraInfo();
        hatch.mostraInfo();

    }

}
