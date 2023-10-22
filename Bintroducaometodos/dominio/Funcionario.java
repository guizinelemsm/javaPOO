package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;


    public void imprimirDados(){
        System.out.println("Nome "+this.nome);
        System.out.println("idade "+this.idade);
        System.out.println("salario01 "+this.salarios[0]);
        System.out.println("salario02 "+this.salarios[1]);
        System.out.println("salario03 "+this.salarios[2]);

        for(double num: salarios){
            media+=num;
        }
        media /= salarios.length;
        System.out.println("A média do salário é: "+media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}

