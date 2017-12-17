package Grafo;

import Interace.Estaciones;

public class Estacion implements Estaciones{
	private String nombre=null;
	private int codigo=0;
	private int coordenaX=0;
	private int coordenadaY=0;

	public Estacion(int codigo,String Nombre,int x, int y) {
		this.codigo=codigo;
		this.nombre=Nombre;
		this.coordenaX=x;
		this.coordenadaY=y;		
	} 
	@Override
	public int getCodigo(String nombre) {
		if(nombre.equals(this.nombre)) {
			return this.codigo;
		}
		return 0;
	}

}
