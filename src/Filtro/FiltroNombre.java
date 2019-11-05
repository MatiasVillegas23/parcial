package Filtro;

import territorio.Comarca;

public class FiltroNombre implements Filtro{
	
	private String nombre;
	
	public FiltroNombre(String n){
		this.nombre = n;
	}

	@Override
	public boolean eval(Comarca c) {
		return c.getName().equals(this.nombre);
	}

}
