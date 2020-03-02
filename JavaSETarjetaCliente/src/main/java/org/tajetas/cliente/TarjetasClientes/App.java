package org.tajetas.cliente.TarjetasClientes;

import java.util.List;

import org.certific.tarjetadigital.service.Inscripcion;
import org.certific.tarjetadigital.service.Nivel;
import org.certific.tarjetadigital.service.Programas;
import org.certific.tarjetadigital.service.Response;

/**
 * Hello world!
 * 
 * wsimport -keep -verbose http://frozen-springs-2501.herokuapp.com/InscripcionService?wsdl
 *
 */
public class App {

	public static void main(String[] args) {
		
		InscripcionDigital inscripcion = new InscripcionDigital();
		
		Response Resultado = new Response();
		
		try {
			
			
			
			
			Inscripcion Objeto = new Inscripcion();
			
			Objeto.setApellidoMaterno("Morales");
			Objeto.setApellidoPaterno("Lopez");
			Objeto.setEmail("marcos.morales@ni.gt.com");
			Objeto.setEstado(true);
			Objeto.setNivel(Nivel.INTERMEDIO);
			Objeto.setNombre("Marcos");
			Objeto.setPrograma(Programas.JAVA_ORACLE);
			Objeto.setTelefono("65667777878");
			
			Resultado= inscripcion.CrearIncrip(Objeto);
		
			
				System.out.print(Resultado.getMessage() + "\n");
				
				
				System.out.print("Lista de Inscritos\n");
				
				
				List<Inscripcion> Ins = inscripcion.ObtenerInscripciones();
				
				for(Inscripcion game : Ins)
				{
					System.out.print("Nombre: "+ game.getNombre() + " Email: " + game.getEmail() + "\n");
				}
				
				System.out.print(inscripcion.ObtenerInscripciones());
				
			
			
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}
}
