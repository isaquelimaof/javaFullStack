package calculoMediaAlunoPOO;

import javax.swing.*;

public class EntradaDeDadosAluno {
    public static void main(String[] args) {


                                                                                                  
        Aluno aluno1 = new Aluno();

        String usuario1 = JOptionPane.showInputDialog("DIGITE SEU NOME !!!");
        int    usuario2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE !!!"));
        String usuario3 = JOptionPane.showInputDialog("DIGITE SUA DATA DE NASCIMENTO NO FORMATO dd/MM/yyyy !!!");
        String usuario4 = JOptionPane.showInputDialog("DIGITE SEU RG !!!");
        String usuario5 = JOptionPane.showInputDialog("DIGITE SEU CPF !!!");

        aluno1.setNome(usuario1);
        aluno1.setIdade(usuario2);
        aluno1.setDataDeNascimento(usuario3);
        aluno1.setNumeroRg(usuario4);
        aluno1.setNumerocpf(usuario5);


        System.out.println("Resposta:\nNOME: " + aluno1.getNome());
        System.out.println("IDADE: " + aluno1.getIdade());
        System.out.println("DATA DE NASCIMENTO: " + aluno1.getDataDeNascimento());
        System.out.println("NUMERO DO RG: " + aluno1.getNumeroRg());
        System.out.println("NUMERO DO CPF: " + aluno1.getNumerocpf());

        for (int i = 0; i < 5;i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
            aluno1.setNota1(nota);
            aluno1.setNota2(nota);
            aluno1.setNota3(nota);
            aluno1.setNota4(nota);
        }

        if (aluno1.getMediaNota() >= 60.0) {
            System.out.println("SUA MÉDIA É: ----->>> " + aluno1.getMediaNota() + "\n\n!!! PARABENS VOCÊ ESTÁ APROVADO !!!");
        } else {
            System.out.println("!!! Você está reprovado !!!\n   !!! SUA MÉDIA FICOU ABAIXO DE 6,0");
            System.out.println("SUA MÉDIA É: ----->>> " + aluno1.getMediaNota());

        }

        System.out.println("Resultado: "+ aluno1.getAlunoAprovado());
    }
}
