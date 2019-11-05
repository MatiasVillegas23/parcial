package Filtro;

import territorio.*;

public class FiltroAnd implements Filtro{
	private FiltroAnd f1, f2;
	
	public FiltroAnd(FiltroAnd f1, FiltroAnd f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean eval(Comarca c) {
		return this.f1.eval(c)&&this.f2.eval(c);
	}

}
