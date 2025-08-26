package atividade1;

public class Carro {
    String marca;
    int ano;
    String modelo;
    Motor motor;

    void mostrarDetalhes(){
        System.out.println("Detalhes do carro: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------");
        System.out.println("Detalhes do Motor: ");
        motor.mostrarDetalhesMotor();
        System.out.println("--------");
    }

    void ligar(){
        motor.ligar();
    }

    void acelerar(){
        System.out.println("Acelerando");
        System.out.println("----------");
    }

    void desacelerar(){
        System.out.println("Desacelando");
        System.out.println("----------");
    }

    void desligar(){
        motor.desligar();
    }
}
