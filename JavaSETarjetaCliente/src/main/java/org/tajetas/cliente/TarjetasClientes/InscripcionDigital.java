package org.tajetas.cliente.TarjetasClientes;

import java.util.List;

import org.certific.tarjetadigital.service.Inscripcion;
import org.certific.tarjetadigital.service.InscripcionService;
import org.certific.tarjetadigital.service.InscripcionServiceImplService;
import org.certific.tarjetadigital.service.Response;

public class InscripcionDigital {
	
	
private InscripcionService inscripcionService = new InscripcionServiceImplService().getInscripcionServiceImplPort();
	
	public Response CrearIncrip(Inscripcion inscripcion)
	{
			return inscripcionService.crearInscripcion(inscripcion);
	}
	
	public List<Inscripcion> ObtenerInscripciones()
	{
		return inscripcionService.obtenerInscripciones();
	}


}
