package calculoMediaAlunoPOO;

import javax.swing.*;
import java.util.Objects;

public class Disciplina {

    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //Método para remover disciplinas
    public static void disciplinaRemover() {
        Aluno aluno1 = new Aluno();
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
        if (escolha == 0) {
            int continuarRemover = 0;
            int posicao = 1;
            while (continuarRemover == 0) {
                String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina você quer remover? " + aluno1.disciplinas.toString());
                aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                posicao++;
                continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(that.getNota(), getNota()) == 0 && getDisciplina().equals(that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNota(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
