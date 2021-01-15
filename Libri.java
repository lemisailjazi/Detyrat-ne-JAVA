public abstract class Libri{
	
	private int isbn; //readonly
	private String titulli;
	private int vitiPublikimit;
	
	public Libri(int i, String t, int vP){
		isbn = i;
		titulli = t;
		vitiPublikimit = vP;
	}
	
	public int getIsbn(){ return isbn; }
	
	public String getTitulli(){ return titulli; }
	
	public int getVitiPublikimit(){ return vitiPublikimit; }

	public void setTitulli(String t){ titulli = t; }
	
	public void setVitiPublikimit(int vP){ vitiPublikimit = vP; }
	
	public abstract boolean kaDetyra();
	
	public String toString(){
		return isbn + " : " + titulli + " - " +  vitiPublikimit;
	}
	
	public boolean equals(Object o){
		return (o instanceof Libri) ? isbn == ((Libri)o).getIsbn() : false;
		
		/*
		if(o instanceof Libri){
			return isbn ==  ((Libri)o).getIsbn();
		}
		return false;
		*/
	}
}