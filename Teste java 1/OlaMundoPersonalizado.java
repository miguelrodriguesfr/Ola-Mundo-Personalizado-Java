import java.util.Scanner;

public class OlaMundoPersonalizado {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        
        // Pede o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        // Exibe a mensagem personalizada
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao mundo da programação!");
        
        // Fecha o Scanner
        entrada.close();
    }
}
