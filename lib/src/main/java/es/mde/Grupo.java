package es.mde;

public class Grupo {

	private int codigoGrupo;
	private int numeroAlumnos;

	public Grupo() {
	}

	public Grupo(int codigoGrupo, int numeroAlumnos) {
		this.codigoGrupo = codigoGrupo;
		this.numeroAlumnos = numeroAlumnos;
	}

	public int getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

}