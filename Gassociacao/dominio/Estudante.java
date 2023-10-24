package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }
    public void imprime(){
        System.out.println("----------------");
        System.out.println("##### ESTUDANTE #####");
        System.out.println(nome);
        System.out.println(idade+" anos");
        System.out.println("SEMINÁRIO");
        if (seminario.getTitulo() == null) return;
        System.out.println(seminario.getTitulo());

    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
