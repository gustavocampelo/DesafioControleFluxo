import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do terminal.
        Scanner terminal = new Scanner(System.in);

        // Solicita e lê o primeiro parâmetro.
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicita e lê o segundo parâmetro.
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem.
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Se houver uma exceção, imprime a mensagem correspondente.
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é MAIOR ou IGUAL ao segundo.
        if (parametroUm >= parametroDois) {
            // Lança uma exceção personalizada se o primeiro for maior ou igual.
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de números a serem impressos.
        int contagem = parametroDois - parametroUm;

        // Realiza um loop para imprimir os números incrementados.
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe de exceção personalizada para parâmetros inválidos.
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        // Chama o construtor da superclasse (Exception) com a mensagem fornecida.
        super(message);
    }
}