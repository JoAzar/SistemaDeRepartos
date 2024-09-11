package SistemaDeRepartos.Repartos;
import java.util.ArrayList;

public class Reparto {
	String nombreReparto;
	private ArrayList<Deposito> depositos;
	
	//crear reparto
	public Reparto(String nombre) {
		this.depositos = new ArrayList<>();
	}
	
	
	//crear deposito
	public void crearDeposito(Deposito deposito) {
		depositos.add(deposito);
	}
	
	//cargar paquete en el déposito
	public void cargarPaqueteEnDeposito(String nombreDepo, int codNumerico, String destino) {
		for(Deposito deposito : depositos) {
			if(deposito.getNombreDeposito().equals(nombreDepo)) {
				deposito.cargarPaquete(codNumerico, destino);
			}
		}
	}
	
	//quitar paquete del deposito
	public boolean quitarDelDeposito(int codPaquete, String nombreDepo) {
		for(Deposito deposito : depositos) {
			if(deposito.getNombreDeposito().equals(nombreDepo)) {
				if(deposito.quitarPaquete(codPaquete)) {
					System.out.println("El apaquete con código: "+codPaquete+" fue eliminado del depósito "+nombreDepo+".");
					return true;
				}else{
					System.out.println("El paquete "+codPaquete+" no se encuentra disponible en el depósito "+nombreDepo+".");
					return false;
				}
			}
		}
		System.out.println("El depósito "+nombreDepo+" no existe.");
		return false;
	}

	
	
	
}
