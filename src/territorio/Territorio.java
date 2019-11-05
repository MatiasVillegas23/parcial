package territorio;

import java.util.ArrayList;

import Filtro.*;

public abstract class Territorio {
	private String name;
	
	public Territorio(String n){
		this.name = n;
	}
	
	public abstract int totalHabitantes();
	
	public abstract int superficieTotal();
	
	public abstract int getTotalIngresos();
	
	public abstract ArrayList<Comarca> getColonias(Filtro f);
	
	public int ingresosPCapita(){
		return this.getTotalIngresos()/this.totalHabitantes();
	}
	
	public int densidadPoblacion(){
		return this.totalHabitantes()/this.superficieTotal();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*@Override
	public int compareTo(Territorio t) {
		return t.getName().compareTo(this.getName());
	}*/
}
