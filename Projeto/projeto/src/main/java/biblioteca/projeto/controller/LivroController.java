package biblioteca.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.projeto.model.Livro;
import biblioteca.projeto.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	@Autowired
	LivroService livroService;
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Long id) {
	    livroService.delete(id);
	}
	
	@PostMapping("/salvar")
	public void salvar(@RequestBody Livro livro) {
	    livroService.salvar(livro);
	}

	@PutMapping("/atualizar/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Livro livro) {
	    livroService.atualizar(id, livro);
	}
	
		
	@GetMapping("/listar")
	public List<Livro> listar() {
	    return livroService.listar();
	}

		
	}


