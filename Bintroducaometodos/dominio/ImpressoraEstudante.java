package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("--------------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
