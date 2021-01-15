public class Enciklopedia extends Libri{
	
	private int nrAutoreve;
	
	public Enciklopedia(int i, String t, int vP, int nrA){
		super(i, t, vP);
		nrAutoreve = nrA;
	}
	
	public int getNrAutoreve(){ return nrAutoreve;  }
	
	public void setNrAutoreve(int nrA){ nrAutoreve = nrA; }
	
	public boolean kaDetyra(){ return false; }
	
	public String toString(){
		return "Enciklopedia " + super.toString() + " ka " + nrAutoreve + " autor";
	}

}