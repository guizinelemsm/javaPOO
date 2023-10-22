package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Gabriel");
        funcionario01.setIdade(18);
        funcionario01.setSalarios(new double[] {3200, 1400, 2900});

        funcionario01.imprimirDados();
        System.out.println("Média: "+ funcionario01.getMedia());


    }
}
