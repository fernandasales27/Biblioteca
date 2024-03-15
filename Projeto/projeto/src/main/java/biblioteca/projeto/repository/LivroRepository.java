package biblioteca.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.projeto.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long>{

	
}
