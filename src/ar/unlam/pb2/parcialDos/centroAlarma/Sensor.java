package ar.unlam.pb2.parcialDos.centroAlarma;

public class Sensor {
	
	private Integer id;
	private boolean activado;
	
	public Sensor(Integer id, boolean activado) {
		this.id = id;
		this.activado = activado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public void add(Sensor sensor) {
		
		
	}
	public boolean activarSensorDeAlarma(int idSensor, int idAlarma,
			String codigoActivacionAlarma) {
				return activado;
		
	}



}
