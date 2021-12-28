package calculoMediaAlunoPOO.prog;

import java.util.Objects;

public class Diretor extends Pessoa{

    private String registroEducacao;
    private double tempoDirecao;
    private String titulacao;

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public double getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(double tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Diretor diretor = (Diretor) o;
        return Double.compare(diretor.tempoDirecao, tempoDirecao) == 0 && registroEducacao.equals(diretor.registroEducacao) && titulacao.equals(diretor.titulacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registroEducacao, tempoDirecao, titulacao);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
}
