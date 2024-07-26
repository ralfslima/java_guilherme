import java.util.Scanner;

public class Main {

private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {

    boolean continuar = true;

    while (continuar) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar Pessoa");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Atualizar Pessoa");
        System.out.println("4 - Remover Pessoa");
        System.out.println("5 - estatistica");
        System.out.println("6 - Sair");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        switch (opcao) {
            case 1:
                Acoes.adicionarPessoa();
            break;

            case 2:
                Acoes.listarPessoas();
            break;

            case 3:
                Acoes.atualizarPessoa();
            break;

            case 4:
                Acoes.removerPessoa();
            break;
        
            case 5:
                Acoes.estatistica();
            break;

            case 6:
                //sair(); <- Por qual motivo você fez isso?
                continuar = false;
            break;

            default:
                System.out.println("Saindo...");
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

    }

}