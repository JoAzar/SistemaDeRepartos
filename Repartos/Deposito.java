package SistemaDeRepartos.Repartos;
import java.util.*;


public class Deposito {
	
	private Map<Integer, Paquete> paquetes;
	private String nombreDepo;
	
	public Deposito(String nombreDepo) {
		this.nombreDepo = nombreDepo;
		this.paquetes = new HashMap<>();
	}
	
	public String getNombreDeposito() {
		return this.nombreDepo;
	}
	
	public void cargarPaquete(int codNumerico, String destino) {
		Paquete paquete = new Paquete(codNumerico, destino);
		paquetes.put(codNumerico, paquete);
		System.out.println("Paquete con código: "+codNumerico+" cargado en el depósito");
	}
	
	public boolean quitarPaquete(int codNumerico) {
		if(paquetes.containsKey(codNumerico)) {
			paquetes.remove(codNumerico);
			return true;
		}
		return false;
	}
	
}
