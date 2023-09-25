import java.util.*;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os nomes separados por vírgula
        System.out.print("Digite os nomes separados por vírgula: ");
        String entrada = scanner.nextLine();

        // Divide a entrada em nomes, removendo os espaços em branco
        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordena os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibe os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
