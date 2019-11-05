package Filtro;

import territorio.*;

public class FiltroHabitantes implements Filtro{
	private int habitantes;
	
	public FiltroHabitantes(int h){
		this.habitantes = h;
	}

	@Override
	public boolean eval(Comarca c) {
		return c.getCantHabitantes()>=this.habitantes;
	}
}
