package calculoMediaAlunoPOO;

import calculoMediaAlunoPOO.prog.Aluno;
import calculoMediaAlunoPOO.prog.Diretor;
import calculoMediaAlunoPOO.prog.Disciplina;
import calculoMediaAlunoPOO.prog.Secretario;
import calculoMediaAlunoPOO.prog.autenticacaoExtrema.FuncaoAutenticacaoDiretor;
import calculoMediaAlunoPOO.prog.autenticacaoExtrema.FuncaoAutenticacaoSecretario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static calculoMediaAlunoPOO.prog.Pessoa.teste;

public class AppAluno {

        public static void main(String[] args) {


                FuncaoAutenticacaoSecretario autenticacaoSecretario = new FuncaoAutenticacaoSecretario();
                FuncaoAutenticacaoDiretor autenticacaoDiretor = new FuncaoAutenticacaoDiretor();

                String resposta = JOptionPane.showInputDialog("Qual o usuário: ");
                if (resposta.equals("Secretario")) {

                        if (autenticacaoSecretario.autenticacaoSecretario(autenticacaoSecretario)){

                                List<Aluno> alunos = new ArrayList<>();

                                for (int qtd = 1; qtd <= 1; qtd++) {
                                        Aluno aluno1 = new Aluno();

                                        String nome = JOptionPane.showInputDialog("Aluno: " + qtd + "\nDIGITE SEU NOME !!!");
                                        int idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE !!!"));
                                        String dataNascimento = JOptionPane.showInputDialog("DIGITE SUA DATA DE NASCIMENTO NO FORMATO dd/MM/yyyy !!!");
                                        String rg = JOptionPane.showInputDialog("DIGITE SEU RG !!!");
                                        String cpf = JOptionPane.showInputDialog("DIGITE SEU CPF !!!");

                                        aluno1.setNome(nome);
                                        aluno1.setIdade(idade);
                                        aluno1.setDataDeNascimento(dataNascimento);
                                        aluno1.setNumeroRg(rg);
                                        aluno1.setNumerocpf(cpf);

                                        String nomeDisciplina = JOptionPane.showInputDialog("Digite a " + " disciplina: ");
                                        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + " nota: "));

                                        Disciplina disciplina = new Disciplina();
                                        disciplina.setDisciplina(nomeDisciplina);
                                        disciplina.setNota(nota);

                                        aluno1.getDisciplinas().add(disciplina);

                                        alunos.add(aluno1);
                                }

                                for (Aluno aluno : alunos) {
                                        for (Disciplina disciplina : aluno.disciplinas) {
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

                                        Diretor diretor = new Diretor();
                                        diretor.setNome("Isaque Lima");
                                        diretor.setIdade(32);

                                        Secretario secretario = new Secretario();
                                        secretario.setNome("Manuela Santiago");
                                        secretario.setIdade(28);

                                        Aluno aluno2 = new Aluno();
                                        aluno2.setNome("Calebe Santiago");
                                        aluno2.setIdade(6);

                                        teste(diretor);
                                        teste(secretario);
                                        teste(aluno2);
                                }
                        }else {
                                JOptionPane.showMessageDialog(null, "Acesso negado !!! \nSenha e Login nao confere!!!");
                        }
                }else {
                        JOptionPane.showMessageDialog(null, "Acesso negado !!! \nUsuário não cadatrado!!!");
                }
        }
}












