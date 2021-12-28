package novoProjeto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Pessoa1> listaDados = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            Pessoa1 pessoa = new Pessoa1();

            String nome = JOptionPane.showInputDialog("Digite seu NOME: ");
            pessoa.setNome(nome);
            String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
            pessoa.setCpf(cpf);

            listaDados.add(pessoa);
        }

        for (Pessoa1 teste : listaDados) {
                System.out.println(teste.getNome() + teste.getCpf());
        }
    }
}


