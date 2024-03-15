package biblioteca.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import biblioteca.projeto.model.Livro;
import biblioteca.projeto.repository.LivroRepository;

@Service
public class LivroService {

	 @Autowired
	 LivroRepository livroRepository;

   public void delete(Long id) {
	        livroRepository.deleteById(id);
    }
	

	public void salvar(Livro livro) {
		livroRepository.save(livro);
	}


     public void atualizar(Long id, Livro livro) {
	        // Retrieve the existing livro by ID
	        Livro existingLivro = livroRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Livro not found with ID: " + id));

	        // Update the properties of the existing livro
	        existingLivro.setTitulo(livro.getTitulo());
	        existingLivro.setAutor(livro.getAutor());
	        // ... (other properties)

	        // Save the updated livro
	        livroRepository.save(existingLivro);
	    }


	public List<Livro> listar() {
		return livroRepository.findAll();
	}



}
