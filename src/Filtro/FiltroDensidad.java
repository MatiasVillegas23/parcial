package Filtro;

import territorio.*;

public class FiltroDensidad implements Filtro{
	private int densidad;
	
	public FiltroDensidad(int d){
		this.densidad = d;
	}

	@Override
	public boolean eval(Comarca c) {
		return c.densidadPoblacion()>=this.densidad;
	}
}
