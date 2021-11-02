package calculoMediaAlunoPOO;

import java.util.Objects;

public class Aluno {

    public String nome;
    public int idade;
    public String dataDeNascimento;
    public String numeroRg;
    private String numerocpf;

    private Disciplina disciplina = new Disciplina();


    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Disciplina getDisciplina() {
        return disciplina;
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

        return (disciplina.getNota1()+disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
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
