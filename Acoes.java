// Importações
import java.util.ArrayList;
import java.util.Scanner;

// Classe
public class Acoes {
    
    // ArrayList
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    // Scanner
    private static Scanner scanner = new Scanner(System.in);

    // Contadores
    static int aprovados = 0;
    static int reprovados = 0;

    // Método para cadastrar pessoas
    public static void adicionarPessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Media: ");
        int media = scanner.nextInt();
        System.out.print("Materia: ");
        String materia = scanner.nextLine();
        scanner.nextLine();

        // Contabilizar médias
        if(media >=7){
            aprovados++;
        }else{
            reprovados++;
        }
        
        Pessoa pessoa = new Pessoa(nome, materia, media);
        pessoas.add(pessoa);
        
        System.out.println("Pessoa adicionada com sucesso!");
    }
     
    // Método para listar pessoas
    public static void listarPessoas() {

        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas.");
        } else {
            System.out.println("Lista de Pessoas:");
            
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }

        }
    }
        
    // Método para atualizar pessoas
    public static void atualizarPessoa() {
        System.out.print("Informe o índice da pessoa que deseja atualizar (começando em 0): ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        if (indice >= 0 && indice < pessoas.size()) {
            System.out.print("Novo Nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Nova Media: ");
            int novoMedia = scanner.nextInt();
            System.out.print("Nova Materia: ");
            String novoMateria = scanner.nextLine();
            scanner.nextLine(); // Limpar o buffer do scanner
        
            Pessoa pessoa = pessoas.get(indice);
            pessoa.setNome(novoNome);
            pessoa.setMedia(novoMedia);
            pessoa.setMateria(novoMateria);
            
            System.out.println("Pessoa atualizada com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }

    }
        
    // Método para remover pessoas
    public static void removerPessoa() {
        System.out.print("Informe o índice da pessoa que deseja remover (começando em 0): ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        if (indice >= 0 && indice < pessoas.size()) {
            Pessoa pessoaRemovida = pessoas.remove(indice);
            System.out.println("Pessoa removida: " + pessoaRemovida);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método de estatísticas
    public static void estatistica(){
        System.out.println("Aprovados: "+aprovados);
        System.out.println("Reprovados: "+reprovados);
        
    }
}
