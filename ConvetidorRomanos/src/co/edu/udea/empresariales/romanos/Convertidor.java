package co.edu.udea.empresariales.romanos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/numero")
public class Convertidor implements IConvetidor {

	@Path(value = "/{num}")
	@Produces(value = { MediaType.APPLICATION_JSON })
	@GET
	@Override
	public String convetidor(@PathParam(value = "num") int numeros) {
		String Str = "";
		ConvetidorRomanos numero = new ConvetidorRomanos();
		Str = Str + "Numero " + numero.convertirUnidadesDeMilARomano(numeros)
				+ numero.convertirCentenasARomano(numeros)
				+ numero.convertirDecenasARomano(numeros)
				+ numero.convertirUnidadesARomano(numeros);
		return Str;
	}
}
