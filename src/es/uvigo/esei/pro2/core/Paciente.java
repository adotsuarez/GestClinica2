/*
 * Definicion de la clase Paciente
 */
package es.uvigo.esei.pro2.core;

/**
 *
 * @author nrufino
 */
public abstract class Paciente extends Persona{

    private String numHistorial; // Código de la historia médica
    private Fecha fechaNacimiento;    // Año de nacimiento del paciente

    /** Crea un nuevo paciente, con sus datos: numero historial y fecha nacimiento
     * @param numHistorial número del historial médico
     * @param fechaNacimiento la fecha de nacimiento del paciente
     */
    public Paciente(String nombre, String domicilio, String numHistorial, Fecha fechaNacimiento) {
        super(nombre,domicilio);
        this.setNumHistorial(numHistorial);
        this.setFechaNacimiento(fechaNacimiento);
    }

    public String getNumHistorial() {
        return numHistorial;
    }

    public void setNumHistorial(String numHistorial) {
        this.numHistorial = numHistorial;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("numHistorial=").append(numHistorial).append(" - ");
        sb.append("fechaNacimiento=").append(fechaNacimiento);
        return sb.toString();
    }
}

