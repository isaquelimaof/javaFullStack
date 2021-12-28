package novoProjeto;

import java.util.Objects;

public class Pessoa1 {

    public String nome;
    public String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa1 pessoa1 = (Pessoa1) o;
        return nome.equals(pessoa1.nome) && cpf.equals(pessoa1.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return "Pessoa1{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
