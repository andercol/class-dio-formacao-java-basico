package aulas.oo.part01.paradigma.exemplo001;
/*
* Programa do Exercício Carro
* */
public class ProgramaCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Fiesta", "Ford");

        System.out.println("Meu carro é um: " +carro.getModelo());
        System.out.println("A marca é: " +carro.getMarca());
        System.out.println("Quantidade de passageiros : "+carro.getPassageiros());

        carro.setPassageiros(6);

        carro.setPassageiros(3);
    }
}
