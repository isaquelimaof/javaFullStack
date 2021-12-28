package calculoMediaAlunoPOO.prog;

import java.util.Objects;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String dataDeNascimento;
    protected String numeroRg;
    protected String numerocpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getNumerocpf() {
        return numerocpf;
    }

    public void setNumerocpf(String numerocpf) {
        this.numerocpf = numerocpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && nome.equals(pessoa.nome) && dataDeNascimento.equals(pessoa.dataDeNascimento) && numeroRg.equals(pessoa.numeroRg) && numerocpf.equals(pessoa.numerocpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataDeNascimento, numeroRg, numerocpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", numeroRg='" + numeroRg + '\'' +
                ", numerocpf='" + numerocpf + '\'' +
                '}';
    }
}
