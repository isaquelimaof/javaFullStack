package calculoMediaAlunoPOO;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa {

    public String nomeEscola;

    public ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nomeEscola.equals(aluno.nomeEscola) && disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEscola, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeEscola='" + nomeEscola + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}



