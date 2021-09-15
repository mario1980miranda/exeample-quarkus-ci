package curso.projeto;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import curso.projeto.model.Categoria;
import curso.projeto.repositories.CategoriaRepository;

@Path("/categoria")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaResource {

	@Inject
	private CategoriaRepository categoriaRepository;
	
	@GET
	@Path("/listar")
	public List<Categoria> listarCaegorias(){
		return categoriaRepository.listAll();
	}
	
	@POST
	@Path("/salvar")
	@Transactional
	public Categoria salvarCategoria(@Valid Categoria categoria) {
		categoriaRepository.persist(categoria);
		return categoria;
	}
}
