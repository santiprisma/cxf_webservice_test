package edu.curso;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://curso.edu/", portName = "EjemploPort", serviceName = "EjemploService")
public class Ejemplo {
	@WebMethod(operationName = "saludar", action = "urn:Saludar")
	public String saludar(@WebParam(name = "arg0") String nombre) {
		return "Hola " + nombre;
	}
}
