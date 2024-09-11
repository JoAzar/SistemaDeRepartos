package SistemaDeRepartos.Repartos;

public class Paquete {
	private int codNumerico;
	private String destino;
	
	
	public Paquete(int codNumerico, String destino) {
		this.destino = destino;
		this.codNumerico = codNumerico;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public int getCodNumerico() {
		return this.codNumerico;
	}
	
}
