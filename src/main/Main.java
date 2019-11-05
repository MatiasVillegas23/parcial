package main;

import Filtro.*;

public class Main {

	public static void main(String[] args) {
		Filtro f1 = new FiltroNombre("Argentina");
		Filtro f2 = new FiltroHabitantes(10000);
		Filtro f = new FiltroAnd(f1,f2);
	}
	
}
