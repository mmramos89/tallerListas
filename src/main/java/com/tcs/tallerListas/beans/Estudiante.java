package com.tcs.tallerListas.beans;

public class Estudiante {

	String  tipoDocumento;
	String numeroDocumento;
	String nombre;
	int edad;
	String  grado;

    public String getRepetira_anio() {
        return repetira_anio;
    }

    public void setRepetira_anio(String repetira_anio) {
        this.repetira_anio = repetira_anio;
    }

    String repetira_anio;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
