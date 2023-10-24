package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioAssociacoes {
    public static void main(String[] args) {
        Professor professor = new Professor("Matheus", "Sea of Thieves" );
        Seminario seminario01 = new Seminario("Conceitos dos Barcos");
        Seminario seminario02 = new Seminario("Conceitos do PVP");
        Seminario[] seminarios = {seminario01, seminario02};
        Estudante estudante01 = new Estudante("Guilherme", 15);
        Estudante estudante02 = new Estudante("Couy", 19);
        Estudante estudante03 = new Estudante("Drikxzz", 15);
        Estudante estudante04 = new Estudante("Fafas",20);
        Estudante[] estudantes01 = {estudante01,estudante03};
        Estudante[] estudantes02 = {estudante02,estudante04};
        Local local01 = new Local("Rua Nagibe Lauar 117");
        Local local02 = new Local("Rua Patricia 07");

        Seminario seminario03 = new Seminario("Fodase");


        estudante01.setSeminario(seminario01);
        estudante02.setSeminario(seminario02);
        estudante03.setSeminario(seminario01);
        estudante04.setSeminario(seminario02);
        seminario01.setEstudantes(estudantes01);
        seminario02.setEstudantes(estudantes02);
        professor.setSeminarios(seminarios);
        seminario01.setLocal(local01);
        seminario02.setLocal(local02);
        seminario03.setLocal(local01);

        professor.imprime();
        seminario01.imprime();
        seminario02.imprime();
        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();
        estudante04.imprime();
        local01.imprime();
        local02.imprime();

        seminario03.imprime();
    }
}
