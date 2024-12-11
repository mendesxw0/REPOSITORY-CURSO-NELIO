package pack;

public class Carro {

    // Atributos
     String modelo;
     String numeroDaPlaca;
     int anoDeFabricacao;
     int vel;
     double precoDoVeiculo;


     Carro(String modelo, String numeroDaPlaca, int anoDeFabricacao, int vel) {
         this.modelo = modelo;
         this.numeroDaPlaca = numeroDaPlaca;
         this.anoDeFabricacao = anoDeFabricacao;
         this.vel = vel;
     }  // contém todos os atributos da classe carro.

    Carro(String modelo, String numeroDaPlaca) {
        this.modelo = modelo;
        this.numeroDaPlaca = numeroDaPlaca;
    }

}
