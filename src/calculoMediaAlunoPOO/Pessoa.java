package calculoMediaAlunoPOO;

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
}
