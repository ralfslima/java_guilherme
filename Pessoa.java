public class Pessoa {
    private String nome;
    private String materia;
    private int media;
    
    // Construtor
    public Pessoa(String nome, String materia, int media) {
    this.nome = nome;
    this.materia = materia;
    this.media = media;
    }
    
    // Getters e Setters
    public String getNome() {
    return nome;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }
    
    public String getMateria() {
    return materia;
    }
    
    public void setMateria(String materia) {
    this.materia = materia;
    }
    
    public int getMedia() {
    return media;
    }
    
    public void setMedia (int media) {
    this.media = media;
    }
    
    // Método toString para facilitar a exibição
    @Override
    public String toString() {
    return "Pessoa{" +
    "nome='" + nome + '\'' +
    ", materia='" + materia + '\'' +
    ", media=" + media +
    '}';
    }

    }