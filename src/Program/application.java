package Program;

import java.util.Scanner;
public class application {


    public static void main(String[] args) {
    	
    	//abriu o scaner 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        // aqui ira retornar o resultado das operaçoes abaixo
        int resultado = 0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }

	
}
