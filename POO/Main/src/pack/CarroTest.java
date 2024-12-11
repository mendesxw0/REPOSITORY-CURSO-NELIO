package pack;

public class CarroTest {
    public static void main(String[] args) {
        Carro newCarroTest = new Carro("hts222", "3345-jf4g", 1999, 40);
        // O construtor declarado acima, contém todos os atributos da classe carro.

        String strw =  newCarroTest.modelo = "29372SBD";
        Carro newCarroTest02 = new Carro("24449nvf", "3943-fjrt");


        System.out.println(newCarroTest.modelo);
        System.out.println(newCarroTest.numeroDaPlaca);
        System.out.println(newCarroTest.anoDeFabricacao);
        System.out.println(newCarroTest.vel);


        System.out.println("===================");

        System.out.println(newCarroTest02.numeroDaPlaca);
        System.out.println(newCarroTest02.modelo);

        

    }
}
