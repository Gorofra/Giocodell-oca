package giocodellocares;

public class Giocatore {
	private String nome;
	private int posizione;
	private static String[] nomi= {
									"Gatto", 
									"Topo",
									"Cane",
									"Gallina",
								  };
	public Giocatore() {
		this.setPosizione(0);
		this.setNome();
	} 
	public String getNome() {
		return this.nome;
	}
	//set nome automatico tra quelli sopra
	public void setNome() {
		for(int i=0;i<4;i++) {
			if(nomi[i]!=null) {
				this.nome=nomi[i];
				nomi[i]=null;
				break;
			}
		}
	}
		
	public int getPosizione() {
		return this.posizione;
	}
	//se arrivi in posizione maggiore di 63 torni indietro 
	//del numero di caselle che hai sforato
	public void setPosizione(int posizione) {
		if(posizione>63) {
			posizione-=63;
			this.posizione=63-posizione;
		}
		else {
			this.posizione = posizione;
		}
	}
	private int Lancio() {
		return Dadi.roll();
	}
	//Lancia i dadi e setta la posizione, ritorna la posizione
	public int turno() {
		System.out.println("Lancia i dadi");
		this.setPosizione(this.getPosizione()+this.Lancio());
		return this.getPosizione();
	}
}
