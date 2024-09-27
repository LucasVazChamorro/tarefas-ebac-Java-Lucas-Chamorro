import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nomeAdd;
        System.out.println("Primeira parte do exercício!");
        do {
            System.out.print("Digite um nome (ou pressione Enter para terminar): ");
            nomeAdd = scanner.nextLine().trim();
            if (!nomeAdd.isEmpty()) {
                nomes.add(nomeAdd);
            }
        } while (!nomeAdd.isEmpty());

        Collections.sort(nomes);

        System.out.println("Nomes ordenados: " + String.join(", ", nomes));
        System.out.println();
        System.out.println("Segunda parte do exercício:");

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        String entrada;
        do {
            System.out.println("Informe o nome - sexo (M/F), ou 'sair' para terminar: ");
            entrada = scanner.nextLine();

            if(!entrada.equalsIgnoreCase("sair")){
                String[] partes = entrada.split("-");
                if (partes.length == 2){
                    String nome = partes[0].trim();
                    String sexo = partes[1].trim().toUpperCase();

                    if(sexo.equals("MASCULINO") || sexo.equals("M")){
                        masculino.add(nome);
                    } else if (sexo.equals("FEMININO") || sexo.equals("F")) {
                        feminino.add(nome);
                    } else {
                        System.out.println("Sexo inválido, use 'masculino' ou 'feminino' ou 'M' ou 'F'.");
                    }
                } else {
                    System.out.println("Formato inválido, utilize 'nome - sexo'.");
                }
            }

        } while (!entrada.equalsIgnoreCase("sair"));

        System.out.println("\nLista Masculina:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nLista Feminina:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}