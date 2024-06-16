package ar.unlam.pb2.parcialDos.centroAlarma;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class test {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentraltest() {
		String nombreAlarma = "ProSegur";
		Integer id = 1;
		Integer numeroDeActYDesActivacion =1;
		String codigoDeConfiguracion = "A1";
		Alarma alarma = new Alarma(id, numeroDeActYDesActivacion, codigoDeConfiguracion, nombreAlarma);
		CentralDeAlarma administrador = new CentralDeAlarma(nombreAlarma);
		assertTrue(administrador.agregarAlarma(alarma));
			
	}
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarmatest() {
		Integer dni = 1;
		String nombre = "pepe";
		Usuario usuarioConfi = new UsuarioConfiguradores(dni, nombre);
		Integer id = 1;
		Integer numeroDeActYDesActivacion =1;
		String codigoDeConfiguracion = "A1";
		String nombreAlarma = "ProSegur";
		Alarma alarma = new Alarma(id, numeroDeActYDesActivacion, codigoDeConfiguracion, nombreAlarma);
		CentralDeAlarma administrador = new CentralDeAlarma(nombreAlarma);
		assertTrue(administrador.agregarAlarma(alarma));
		assertTrue(administrador.agregarUsuario(usuarioConfi));
	}
	//como hago para que devuelva verde el test si tira la excepcion
	@Test
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmatestInvalidoSeLanceCodigoAlarmaIncorrectoException() throws CodigoAlarmaIncorrectoException{
		Integer dni = 1;
		String nombre = "pepe";
		Usuario usuarioConfi = new UsuarioConfiguradores(dni, nombre);
		String nombreAlarma = "ProSegur";
		Integer id = 1;
		Integer numeroDeActYDesActivacion =1;
		String codigoDeConfiguracion = "A1";
		Alarma alarma = new Alarma(id, numeroDeActYDesActivacion, codigoDeConfiguracion, nombreAlarma);
		CentralDeAlarma administrador = new CentralDeAlarma(nombreAlarma);
		assertTrue(administrador.agregarUsuario(usuarioConfi));
		administrador.agregarUsuarioAUnaAlarma(dni, id, codigoDeConfiguracion);
		assertTrue(administrador.verficaionDeagregarUsuarioAUnaAlarma(dni, id, codigoDeConfiguracion));
	    }
	
	@Test
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoExceptiontest() throws SensorDuplicadoException{
		String nombreAlarma = "ProSegur";
		Integer id = 1;
		Integer numeroDeActYDesActivacion =1;
		String codigoDeConfiguracion = "A1";
		Alarma alarma = new Alarma(id, numeroDeActYDesActivacion, codigoDeConfiguracion, nombreAlarma);
		Sensor sensor = new Sensor(id, false);
		assertTrue(alarma.agregarSensorAAlarma(id, codigoDeConfiguracion, sensor, id));
	}
	/*@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivadotest() {
		fail("Not yet implemented");
	}
	@Test
	public void queParaUnaAlarmaDeterminadaSePuedaObtenerUnaColeccionOrdenadaDeAcccionesDeTipoConfiguracionOdenadasPorIdDeAcciontest() {
		fail("Not yet implemented");
	}
*/
}
