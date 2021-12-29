package calculoMediaAlunoPOO.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private String displinas;

    public List<Disciplina> disciplinas = new ArrayList<>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

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

    public double getMediaNota() {
        double somaNotas = 0.0;

        for(Disciplina disciplina : disciplinas ){
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    public String getAlunoAprovado(){
        double media = this.getMediaNota();
        if(media >= 50){
            if(media >= 70) {
                return "Aluno está aprovado";
            }else{
                return  "Aluno em recuperação";
            }
        }else{
            return "Aluno está reprovado";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return dataMatricula.equals(aluno.dataMatricula) && nomeEscola.equals(aluno.nomeEscola) && serieMatriculado.equals(aluno.serieMatriculado) && displinas.equals(aluno.displinas) && disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataMatricula, nomeEscola, serieMatriculado, displinas, disciplinas);
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



