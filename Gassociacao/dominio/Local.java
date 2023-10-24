package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("##### LOCAL #####");
        System.out.println("Endereço: "+endereco);
        if(seminario == null) return;
        System.out.println(seminario.getTitulo());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
