package calculoMediaAlunoPOO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EntradaDeDadosAluno {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        for (int qtd = 1; qtd <= 1; qtd++) {

            Aluno aluno1 = new Aluno();


            String nome = JOptionPane.showInputDialog("Aluno: " + qtd + "\nDIGITE SEU NOME !!!");
            //int idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE !!!"));
            //String dataNascimento = JOptionPane.showInputDialog("DIGITE SUA DATA DE NASCIMENTO NO FORMATO dd/MM/yyyy !!!");
            //String rg = JOptionPane.showInputDialog("DIGITE SEU RG !!!");
            //String cpf = JOptionPane.showInputDialog("DIGITE SEU CPF !!!");

            aluno1.setNome(nome);
            //aluno1.setIdade(idade);
            //aluno1.setDataDeNascimento(dataNascimento);
            //aluno1.setNumeroRg(rg);
            //aluno1.setNumerocpf(cpf);

                    String nomeDisciplina = JOptionPane.showInputDialog("Digite a " + " disciplina: ");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + " nota: "));

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(nota);

                    aluno1.getDisciplinas().add(disciplina);


            alunos.add(aluno1);

        }

        Aluno aluno1 = new Aluno();
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

        if (escolha == 0) {

                String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina você quer remover? \n" + aluno1.getNome());
                // aluno1.getDisciplinas().remove(String.valueOf(disciplinaRemover));
                var a = getDisciplinas().get(disciplinaRemover);


        }



        //disciplinaRemover();

        for (Aluno aluno : alunos) {
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                JOptionPane.showMessageDialog(null,
                        "Resposta:\nNOME: " + aluno.getNome()
                                + "\nIDADE: " + aluno.getIdade()
                                + "\nDATA DE NASCIMENTO: " + aluno.getDataDeNascimento()
                                + "\nNUMERO DO RG: " + aluno.getNumeroRg()
                                + "\nNUMERO DO CPF: " + aluno.getNumerocpf()
                                + "\n\nSUA MÉDIA É: ----->>> " + aluno.getMediaNota()
                                + "\n" + aluno.getAlunoAprovado()
                                + "\nMatéria: " + disciplina.getDisciplina());
            }
        }
    }
}










