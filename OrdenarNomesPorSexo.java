import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomesPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de ordenação de nomes por sexo!");
        System.out.println("Para adicionar nomes, digite o nome da pessoa, separe com '-' e coloque o sexo.");
        System.out.println("Use 'f' para feminino e 'm' para masculino.");

        while (true) {
            // Solicita ao usuário que insira os nomes e sexos (exemplo: nome-f, nome-m)
            System.out.print("Digite os nomes e sexos separados por hífen e vírgula (exemplo: nome-f, nome-m): ");
            String entrada = scanner.nextLine();

            // Divide a entrada em pares de nome e sexo
            String[] pares = entrada.split(",");
            List<String> nomesFemininos = new ArrayList<>();
            List<String> nomesMasculinos = new ArrayList<>();

            for (String par : pares) {
                String[] partes = par.trim().split("-");
                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String sexo = partes[1].trim();
                    if (sexo.equalsIgnoreCase("f")) {
                        nomesFemininos.add(nome + " - Feminino");
                    } else if (sexo.equalsIgnoreCase("m")) {
                        nomesMasculinos.add(nome + " - Masculino");
                    }
                }
            }

            // Ordena os nomes por sexo e depois em ordem alfabética
            Collections.sort(nomesFemininos);
            Collections.sort(nomesMasculinos);

            // Exibe os nomes ordenados por sexo e em ordem alfabética, com uma linha em
            // branco entre eles
            System.out.println("Nomes de Sexo Feminino (F):");
            for (String nomeSexo : nomesFemininos) {
                System.out.println(nomeSexo);
            }

            System.out.println(); // Linha em branco

            System.out.println("Nomes de Sexo Masculino (M):");
            for (String nomeSexo : nomesMasculinos) {
                System.out.println(nomeSexo);
            }

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja inserir mais nomes (S para continuar ou qualquer tecla para encerrar)? ");
            String continuar = scanner.nextLine();

            if (!continuar.equalsIgnoreCase("s")) {
                break; // Encerra o loop se o usuário não quiser continuar
            }
        }

        System.out.println("Programa encerrado. Obrigado por usar!");
    }
}
