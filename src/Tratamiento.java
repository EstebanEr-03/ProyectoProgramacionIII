public class Tratamiento {

    private int ID;
    private Doctor doctorDelTratamiento;
    private Paciente pacienteDelTratamiento;
    private String descripcionDelTratamiento;
    private String estadoDelTratamiento; //Finalizado, completado o en proceso

    public Tratamiento() {
    }

    public Tratamiento(int ID, Doctor doctorDelTratamiento, Paciente pacienteDelTratamiento, String descripcionDelTratamiento, String estadoDelTratamiento) {
        this.ID = ID;
        this.doctorDelTratamiento = doctorDelTratamiento;
        this.pacienteDelTratamiento = pacienteDelTratamiento;
        this.descripcionDelTratamiento = descripcionDelTratamiento;
        this.estadoDelTratamiento = estadoDelTratamiento;
    }

    public Tratamiento(int ID, String descripcionDelTratamiento, String estadoDelTratamiento) {
        this.ID = ID;
        this.descripcionDelTratamiento = descripcionDelTratamiento;
        this.estadoDelTratamiento = estadoDelTratamiento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Doctor getDoctorDelTratamiento() {
        return doctorDelTratamiento;
    }

    public void setDoctorDelTratamiento(Doctor doctorDelTratamiento) {
        this.doctorDelTratamiento = doctorDelTratamiento;
    }

    public Paciente getPacienteDelTratamiento() {
        return pacienteDelTratamiento;
    }

    public void setPacienteDelTratamiento(Paciente pacienteDelTratamiento) {
        this.pacienteDelTratamiento = pacienteDelTratamiento;
    }

    public String getDescripcionDelTratamiento() {
        return descripcionDelTratamiento;
    }

    public void setDescripcionDelTratamiento(String descripcionDelTratamiento) {
        this.descripcionDelTratamiento = descripcionDelTratamiento;
    }

    public String getEstadoDelTratamiento() {
        return estadoDelTratamiento;
    }

    public void setEstadoDelTratamiento(String estadoDelTratamiento) {
        this.estadoDelTratamiento = estadoDelTratamiento;
    }
    @Override
    public String toString() {
        return "Tratamiento: \n" +
                "ID: " + ID + "\n" +
                "Descripcion Del Tratamiento: " + descripcionDelTratamiento + "\n" +
                "Estado Del Tratamiento: " + estadoDelTratamiento + "\n" ;
    }

}
