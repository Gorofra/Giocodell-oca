package simulatore;

import giocodellocares.Giocatore;

public class Testclassifica {

	public static void main(String[] args) {
		Giocatore g1=new Giocatore();
		Giocatore g2=new Giocatore();
		Giocatore g3=new Giocatore();
		Giocatore g4=new Giocatore();
		
		Giocatore giocatori[]=new Giocatore[4];
		giocatori[0]=g1;
		giocatori[1]=g2;
		giocatori[2]=g3;
		giocatori[3]=g4;
		
		g3.setPosizione(40);
		g2.setPosizione(15);
		g4.setPosizione(60);
		g1.setPosizione(10);
		
		

		for(Giocatore a:Classifiche.StipulaClassifica(giocatori)) {
			if(a!=null) {
				System.out.println(a.getNome()+" pos: "+ a.getPosizione());
			}
			else {
				System.out.println(".");
			}
		}
		
	}

}
