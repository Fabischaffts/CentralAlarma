package ar.unlam.pb2.parcialDos.centroAlarma;

import java.util.ArrayList;
import java.util.Map;

public class CentralDeAlarma {
	
	private String nombre;
	private ArrayList <Alarma> alarmas;
	private ArrayList <Usuario> usuarioActivadores;
	private ArrayList <Usuario> usariosConfiguradores;
	private Map<Usuario,Alarma>usauarioAlarmaMap;

	public CentralDeAlarma(String nombre) {
		
		this.setNombre(nombre);
		this.alarmas = new ArrayList<>();
		this.usariosConfiguradores = new ArrayList<>();
		this.usuarioActivadores = new ArrayList<>();
	}

	public ArrayList <Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(ArrayList <Alarma> alarmas) {
		this.alarmas = alarmas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean agregarAlarma(Alarma alarma) {
		return alarmas.add(alarma);
	}

	public boolean agregarUsuario(Usuario usuario) {	
		
		Usuario usuariosA = new  UsuarioActivadores(null, nombre);
		if (usuario.equals(usuariosA)) {
			 usariosConfiguradores.add(usuario);
			 return true;
		}else {
			usuarioActivadores.add(usuario);
			return true;

		}
		}
	
	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer
			idAlarma, String codigoConfiguracionAlarma) {
		for(Usuario usuarioBuscado : usuarioActivadores ) {
			for (Usuario usuarioBuscado2 : usariosConfiguradores) {
				for (Alarma alarma : alarmas) {		
				if(usuarioBuscado2.getDni().equals(dniUsuarioAAgregar)||usuarioBuscado.getDni().equals(dniUsuarioAAgregar)&& alarma.getId().equals(idAlarma) && alarma.getCodigoDeConfiguracion().equals(codigoConfiguracionAlarma)) {
					this.usauarioAlarmaMap.put(usuarioBuscado , alarma);									
				}else {
					this.usauarioAlarmaMap.put(usuarioBuscado2, alarma);
				}
			
			}
			
		}
		}
	}
	
	public Boolean verficaionDeagregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer
			idAlarma, String codigoConfiguracionAlarma)throws CodigoAlarmaIncorrectoException {
		this.agregarUsuarioAUnaAlarma(dniUsuarioAAgregar, idAlarma, codigoConfiguracionAlarma);
		
		
	throw new CodigoAlarmaIncorrectoException();
	}

}

	
