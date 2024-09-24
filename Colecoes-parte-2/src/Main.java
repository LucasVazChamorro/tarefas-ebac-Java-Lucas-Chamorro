import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaMasculino = new ArrayList<>();
        ArrayList<String> listaFeminino = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Informe o nome e o sexo (M/F) separados por vírgula: ");
            String entrada = scanner.nextLine();

            String[] dados = entrada.split(",");
            if(dados.length == 2){
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();

                if(sexo.equals("M")){
                    listaMasculino.add(nome);
                } else if (sexo.equals("F")){
                    listaFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
                }
            } else {
                System.out.println("Formato inválido, por favor, digite: Nome, Sexo");
            }

            System.out.println("Deseja continuar? (S/N): ");
            resposta = scanner.nextLine().trim().toUpperCase();
        } while (resposta.equals("S"));

        System.out.println("\nLista Feminino: ");
        for (String nome : listaFeminino) {
            System.out.println(nome);
        }

        System.out.println("\nLista Masculino: ");
        for (String nome : listaMasculino) {
            System.out.println(nome);
        }
    }
}