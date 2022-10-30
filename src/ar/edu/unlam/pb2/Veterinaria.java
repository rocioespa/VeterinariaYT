package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Veterinaria {

	private ArrayList<Mascota> mascotas;

	public Veterinaria() {
		super();
		this.mascotas = new ArrayList<>();
	}
	
	public void agregarMascota(Mascota m) {
		this.mascotas.add(m);
	}
	
	public void saludarACliente() {
		for (Mascota mascota : mascotas) {
			mascota.expresarse();
		}
	}
	

}
