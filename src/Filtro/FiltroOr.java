package Filtro;

import territorio.*;

public class FiltroOr implements Filtro{//filtro o filtroOr???
	private Filtro f1, f2;
	
	public FiltroOr(Filtro f1, Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean eval(Comarca c) {
		return this.f1.eval(c)||this.f2.eval(c);
	}

}
