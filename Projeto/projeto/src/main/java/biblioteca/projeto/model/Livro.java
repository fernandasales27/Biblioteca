package biblioteca.projeto.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Table(name="livro")
@Entity
public class Livro {

	public Livro() {

	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column
	@NotNull
	private Long id;
	
	@Column
	@NotNull
	private String titulo;
	
	@Column
	@NotNull
	private String autor;
	
	@Column
	@NotNull
	private int isbn;

	public Livro(Long id,String titulo, String autor, int isbn) {
		super();
		this.id=id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


}
