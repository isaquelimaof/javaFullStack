package calculoMediaAlunoPOO;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {

    public String nome;
    public int idade;
    public String dataDeNascimento;
    public String numeroRg;
    private String numerocpf;


    public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;

    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNumerocpf() {
        return numerocpf;
    }

    public void setNumerocpf(String numerocpf) {
        this.numerocpf = numerocpf;
    }


    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getIdade() == aluno.getIdade() && getNome().equals(aluno.getNome()) && getDataDeNascimento().equals(aluno.getDataDeNascimento()) && getNumeroRg().equals(aluno.getNumeroRg()) && getNumerocpf().equals(aluno.getNumerocpf()) && getDisciplinas().equals(aluno.getDisciplinas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getDataDeNascimento(), getNumeroRg(), getNumerocpf(), getDisciplinas());
    }

    public String getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return "Aluno está aprovado !!!";
            } else {
                return "Aluno está em recuperação !!!";
            }
        } else {
            return "Aluno está reprovado";
        }


    }
}



