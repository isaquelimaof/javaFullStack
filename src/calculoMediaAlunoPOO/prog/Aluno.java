package calculoMediaAlunoPOO.prog;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa {

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private String displinas;

    public ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public String getDisplinas() {
        return displinas;
    }

    public void setDisplinas(String displinas) {
        this.displinas = displinas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return dataMatricula.equals(aluno.dataMatricula) && nomeEscola.equals(aluno.nomeEscola) && serieMatriculado.equals(aluno.serieMatriculado) && displinas.equals(aluno.displinas) && disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataMatricula, nomeEscola, serieMatriculado, displinas, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", displinas='" + displinas + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}



