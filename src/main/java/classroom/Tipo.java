package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	public int codigo;
	public String nombre;
	//this.nombre=nombre;
	private Tipo(int codigo) {	

		this.codigo = codigo;
	}
  }

