package calculoMediaAlunoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    public String nome;
    public int idade;
    public String dataDeNascimento;
    public String numeroRg;
    private String numerocpf;


    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();


    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
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

        for(Disciplina disciplina : disciplinas){
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }



    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media>=60){
            return true;
        }else{
            return false;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getNome().equals(aluno.getNome()) && getNumerocpf().equals(aluno.getNumerocpf());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumerocpf());
    }

}
