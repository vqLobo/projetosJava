package atividade1;

public class Motor {
    String tipoCombustivel;
    int potenciaCV;

    void mostrarDetalhesMotor(){
        System.out.println("Tipo de Combustivel: " + tipoCombustivel);
        System.out.println("Potencia em CV: " + potenciaCV);
    }

    void ligar(){
        System.out.println("Motor Ligado");
        System.out.println("----------");
    }

    void desligar(){
        System.out.println("Motor Desligado");
        System.out.println("----------");
    }
}
