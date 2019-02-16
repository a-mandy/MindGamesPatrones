 package com.ucenfotec.logic.entities;

import java.util.ArrayList;

public abstract class Pieza {
	protected String color;
	
	boolean puedeMover() {
		return true;
	}
	
	boolean puedeCapturar() {
		return false;
	}
	
	ArrayList<Casilla> movimientosPosibles(){
		ArrayList<Casilla> movimientos=null;
		return movimientos;
	}
	

}
