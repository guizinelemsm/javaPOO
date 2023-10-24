package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;

    private Estudante[] estudantes;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("##### SEMINÁRIO #####");
        System.out.println("TÍTULO");
        System.out.println(titulo);
        if (local == null){ System.out.println("ERROR");return;}
        System.out.println("ENDEREÇO");
        System.out.println(local.getEndereco());
        System.out.println("ALUNOS");
        for (Estudante estudante : estudantes) {
            if (estudante.getNome() == null)return;
            System.out.println(estudante.getNome()+" "+estudante.getIdade()+" Anos");
        }

    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
