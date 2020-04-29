package es.uvigo.esei.pro2.core;

/**
 * @author adotsuarez
 * (C) Agustin Suarez Martinez, 2020 - adot.c1.biz
 */
public class Externo extends Medico {
    private boolean especialidad;

    public Externo(String nombre, String domicilio, String numColegiado, boolean especialidad) {
        super(nombre, domicilio, numColegiado);
        this.especialidad = especialidad;
    }

    public boolean isEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(boolean especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Externo:\n");
        if (isEspecialidad()) {
            sb.append("- Es especialista\n");
        }
        sb.append(super.toString());
        return sb.toString();
    }
}
