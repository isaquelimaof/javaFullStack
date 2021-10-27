package calculoMediaAlunoPOO;

public class Aluno {

    public String nome;
    public int idade;
    public String dataDeNascimento;
    public String numeroRg;
    private String numerocpf;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
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
        return (getNota1()+getNota2()+getNota3()+getNota4())/4;
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media>=60){
            return true;
        }else{
            return false;
        }

    }

}
