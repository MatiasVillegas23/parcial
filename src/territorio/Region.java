package territorio;

import java.util.ArrayList;
import java.util.Collections;

import Filtro.*;

public class Region extends Territorio{
	private ArrayList<Territorio> territorios;
	
	public Region(String n){
		super(n);
		territorios = new ArrayList<Territorio>();
	}

	@Override
	public int totalHabitantes() {
		int aux = 0;
		for (int i = 0; i < this.territorios.size(); i++) {
			aux += this.territorios.get(i).totalHabitantes();
		}
		return aux;
	}

	@Override
	public int superficieTotal() {
		int aux = 0;
		for (int i = 0; i < this.territorios.size(); i++) {
			aux += this.territorios.get(i).superficieTotal();
		}
		return aux;
	}

	@Override
	public int getTotalIngresos() {
		int aux = 0;
		for (int i = 0; i < this.territorios.size(); i++) {
			aux += this.territorios.get(i).getTotalIngresos();
		}
		return aux;
	}

	public ArrayList<Territorio> getColonias(Filtro f){
		ArrayList<Territorio> aux = new ArrayList<Territorio>();
		
		for (int i = 0; i < this.territorios.size(); i++) {
			if (this.territorios.get(i)!=null) {
				aux.addAll(this.getColonias(f));
			}
		}
		Collections.sort(aux);
		return aux;
	}
}