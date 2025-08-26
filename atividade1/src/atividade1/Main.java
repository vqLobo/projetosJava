package atividade1;

public class Main {
    public static void main(String[] args) {
        //cria motor1
        Motor motor = new Motor();

        //define as propriedades do motor1
        motor.tipoCombustivel = "Diesel";
        motor.potenciaCV = 150;

        //cria motor2
        Motor motor2 = new Motor();

        //define as propriedades do motor2
        motor2.tipoCombustivel = "Gasolina";
        motor2.potenciaCV = 321;

        //cria carro1
        Carro carro = new Carro();

        //define as props carro1
        carro.motor = motor;
        carro.modelo = "Impreza";
        carro.marca = "Subaru";
        carro.ano = 2006;

        //cria carro2
        Carro carro2 = new Carro();

        //define props carro2
        carro2.motor = motor2;
        carro2.modelo = "Lancer";
        carro2.marca = "Mitsubichi";
        carro2.ano = 2012;

        //ações carro1
        carro.mostrarDetalhes();
        carro.ligar();
        carro.acelerar();
        carro.desacelerar();
        carro.desligar();

        //ações carro2
        carro2.mostrarDetalhes();
        carro2.ligar();
        carro2.acelerar();
        carro2.desacelerar();
        carro2.desligar();
        //fim
    }
}
