package territorio;

import java.util.ArrayList;

import Filtro.*;

public class Comarca extends Territorio /*implements Comparable<Comarca>*/{
	private int superficie, cantHabitantes, totalIngresos;
	
	public Comarca(String n, int s, int ch, int ti){
		super(n);
		this.superficie = s;
		this.cantHabitantes = ch;
		this.totalIngresos = ti;
	}
	
	public ArrayList<Territorio> getColonias(Filtro f){
		ArrayList<Territorio> aux = new ArrayList<Territorio>();
		if (f.eval(this)) {
			aux.add(this);
		}
		return aux;
	}

	/*@Override
	public int compareTo(Comarca c) {
		return c.getName().compareTo(this.getName());
	}*/

	@Override
	public int totalHabitantes() {
		return this.getCantHabitantes();
	}

	@Override
	public int superficieTotal() {
		return this.getSuperficie();
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public int getTotalIngresos() {
		return totalIngresos;
	}

	public void setTotalIngresos(int totalIngresos) {
		this.totalIngresos = totalIngresos;
	}

}
