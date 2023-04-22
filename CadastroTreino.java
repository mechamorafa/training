import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTreino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Treino> treinos = new ArrayList<Treino>();
        boolean continua = true;
        while (continua) {
            System.out.println("Digite o nome do treino: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a data do treino (dd/mm/aaaa): ");
            String data = scanner.nextLine();
            System.out.println("Digite o resultado do treino: ");
            String resultado = scanner.nextLine();
            System.out.println("Digite o comentário sobre o treino: ");
            String comentario = scanner.nextLine();
            Treino treino = new Treino(nome, data, resultado, comentario);
            treinos.add(treino);
            System.out.println("Deseja cadastrar outro treino? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continua = false;
            }
        }
        System.out.println("Treinos cadastrados:");
        for (Treino t : treinos) {
            System.out.println(t);
        }
    }
}
