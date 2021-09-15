package curso.projeto.repositories;

import javax.enterprise.context.ApplicationScoped;

import curso.projeto.model.Categoria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CategoriaRepository implements PanacheRepository<Categoria> {

}
