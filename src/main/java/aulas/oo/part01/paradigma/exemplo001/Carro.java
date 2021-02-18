package aulas.oo.part01.paradigma.exemplo001;
/*
* Exercício - Criar uma classe carro que deve ter a qtd de pessoas
* e ser posssivel adicionar e remover pessoas de dentro do carro
* */
public class Carro {

    private String modelo = "GOL";
    private String marca = "Wolksvagem";
    public int passageiros = 5;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros > 5){
            System.out.println("não cabe tantas pessoas em um "+getModelo());
        }else {
            this.passageiros = passageiros;
            System.out.println("Agora há "+ getPassageiros()+ " a bordo!:)");
        }
    }
}
