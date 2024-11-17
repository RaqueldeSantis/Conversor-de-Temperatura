// Programa Conversor de Temperatura

import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Conversor de Temperatura!");
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " graus Celsius são " + fahrenheit + " graus Fahrenheit.");
        } else if (choice == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " graus Fahrenheit são " + celsius + " graus Celsius.");
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
    }
}
