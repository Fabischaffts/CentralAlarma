package ar.unlam.pb2.parcialDos.centroAlarma;

import java.util.ArrayList;

public class Alarma {
	
	private Integer id;
	private Integer numeroDeActYDesActivacion;
	private String codigoDeConfiguracion;
	private String nombre;
	private ArrayList<Usuario>usuarios;
	private ArrayList<Accion>acciones;
	private ArrayList<Sensor> sensores;
	
	public Alarma(Integer id, Integer numeroDeActYDesActivacion, String codigoDeConfiguracion, String nombre) {
		this.id = id;
		this.numeroDeActYDesActivacion = numeroDeActYDesActivacion;
		this.codigoDeConfiguracion = codigoDeConfiguracion;
		this.nombre = nombre;
		this.usuarios = new ArrayList<>();
		this.acciones = new ArrayList<>();
		this.sensores = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroDeActYDesActivacion() {
		return numeroDeActYDesActivacion;
	}

	public void setNumeroDeActYDesActivacion(Integer numeroDeActYDesActivacion) {
		this.numeroDeActYDesActivacion = numeroDeActYDesActivacion;
	}

	public String getCodigoDeConfiguracion() {
		return codigoDeConfiguracion;
	}

	public void setCodigoDeConfiguracion(String codigoDeConfiguracion) {
		this.codigoDeConfiguracion = codigoDeConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}
	//por que no puedo agregar un sensor a la lista de sensores
	public boolean agregarSensorAAlarma(Integer idAlarma, String
			codigoConfiguracionAlarma, Sensor sensor,Integer idUsuarioConfigurador) throws SensorDuplicadoException {
		for (Sensor sensorBuscado : sensores) {
			if(!sensorBuscado.equals(sensor)) {
				sensorBuscado.add(sensor);	
			}
		}
		
		throw new SensorDuplicadoException();
		
	}
	
	
}
