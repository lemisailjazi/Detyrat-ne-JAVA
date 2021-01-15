public class LibriShkollor extends Libri{
	
	private String drejtimi;
	
	public LibriShkollor(int i, String t, int vP, String d){
		super(i, t, vP);
		drejtimi = d;
	}
	
	public String getDrejtimi(){ return drejtimi; }
	
	public void setDrejtimi(String d){ drejtimi = d; }
	
	public boolean kaDetyra(){ return true; }
	
	public String toString(){
		return "Libri  Shkollor " + super.toString() + " : " + drejtimi;
	}
	
}