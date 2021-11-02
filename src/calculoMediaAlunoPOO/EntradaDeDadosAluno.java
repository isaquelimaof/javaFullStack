package calculoMediaAlunoPOO;

import javax.swing.*;

public class EntradaDeDadosAluno {
    public static void main(String[] args) {


                                                                                                  
        Aluno aluno1 = new Aluno();

        String nome = JOptionPane.showInputDialog("DIGITE SEU NOME !!!");
        int    idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE !!!"));
        String dataNascimento = JOptionPane.showInputDialog("DIGITE SUA DATA DE NASCIMENTO NO FORMATO dd/MM/yyyy !!!");
        String rg = JOptionPane.showInputDialog("DIGITE SEU RG !!!");
        String cpf = JOptionPane.showInputDialog("DIGITE SEU CPF !!!");

        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataDeNascimento(dataNascimento);
        aluno1.setNumeroRg(rg);
        aluno1.setNumerocpf(cpf);

        for (int i = 0; i < 5;i++) {

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
            String disciplina = JOptionPane.showInputDialog("Digite a disciplina: ");

            aluno1.getDisciplina().setDisciplina1(disciplina);
            aluno1.getDisciplina().setNota1(nota);
            aluno1.getDisciplina().setDisciplina1(disciplina);
            aluno1.getDisciplina().setNota2(nota);
            aluno1.getDisciplina().setDisciplina1(disciplina);
            aluno1.getDisciplina().setNota3(nota);
            aluno1.getDisciplina().setDisciplina1(disciplina);
            aluno1.getDisciplina().setNota4(nota);
            aluno1.getDisciplina().setDisciplina1(disciplina);

        }

        if (aluno1.getMediaNota() >= 60.0) {

            JOptionPane.showMessageDialog(null,"Resposta:\nNOME: " + aluno1.getNome()
                    + "\nIDADE: " + aluno1.getIdade()+ "\nDATA DE NASCIMENTO: " + aluno1.getDataDeNascimento()
                    + "\nNUMERO DO RG: " + aluno1.getNumeroRg()+ "\nNUMERO DO CPF: " + aluno1.getNumerocpf()
                    + "\nSUA MÉDIA É: ----->>> " + aluno1.getMediaNota()
                    + "\n\n!!! PARABENS VOCÊ ESTÁ APROVADO !!!");

        } else {
            JOptionPane.showMessageDialog(null,
                    "Aluno: "+ aluno1.getNome() + "\n!!! Você está reprovado !!!\n!!! SUA MÉDIA FICOU ABAIXO DE 6,0"+
                    "\nSUA MÉDIA É: >>>>>> " + aluno1.getMediaNota());
        }

    }

}
