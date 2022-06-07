package ejercicio3.entidad;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity(name="nivel")
	public class Nivel implements Serializable{
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="id_nivel")
		@GeneratedValue(strategy= GenerationType.IDENTITY)
	    int id;
	    
		@Column(nullable=false)
		private String nombre;

		
		
		public Nivel() {
			super();
		}

		public Nivel(int id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return nombre ;
		}
				
	}

