package calculoMediaAlunoPOO.prog;

import java.util.Objects;

public class Secretario extends Pessoa{

    private String registro;
    private String nivelCargo;
    private String experiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Secretario that = (Secretario) o;
        return registro.equals(that.registro) && nivelCargo.equals(that.nivelCargo) && experiencia.equals(that.experiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registro, nivelCargo, experiencia);
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}
