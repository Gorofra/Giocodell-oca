package simulatore;
import giocodellocares.*;
import java.util.*;

public class Simulatore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("quanti giocatori? da 1 a 4");
		int nGiocatori=sc.nextInt()+1;
		Giocatore[] giocatori=new Giocatore[nGiocatori];
		for(int i=1; i<nGiocatori; i++) {
			giocatori[i]= new Giocatore();
			System.out.println(giocatori[i].getNome());
		}
		
		 
		int nPartite=0;
		do {
			try {
				System.out.println("quante partite vuoi giocare? \n 1 \n 3 \n 5");
				int s=sc.nextInt();
				switch(s) {
				case 1:
					nPartite=1;
					break;
				case 3:
					nPartite=3;
					break;
					
				case 5:
					nPartite=5;
					break;
				case 2:
				case 4:
				default :
					throw new Exception();
				}
			}
			catch(Exception ex) {
				System.out.println("solo numeri tra 1, 3 o 5");
			}
		}while (nPartite==0);
		
		
		
		
		int cont=0;
		System.out.println("Inizia La partita!!!");
		do {
			for(int i=0; i<giocatori.length; i++) {
				if(giocatori[i]!=null) {
					System.out.println("è il turno di: "+giocatori[i].getNome() );
					int posizioneIniziale=giocatori[i].getPosizione();
					int posizioneFinale=giocatori[i].turno();
					System.out.println(giocatori[i].getNome()+ " si muove di "+ (posizioneFinale-posizioneIniziale)+" posizioni!" );
					System.out.println("ragiunge la posizione == "+ posizioneFinale);
					if(posizioneFinale==20) {
						System.out.println("sei capitato nella casella 20, vai vanti di 10 caselle");
						giocatori[i].setPosizione(30);
					}
					if(posizioneFinale==50) {
						System.out.println("sei sulla casella 50, torni all'inizio!");
						giocatori[i].setPosizione(0);
					}
					if(posizioneFinale>=63) {
						cont++;
						System.out.println(giocatori[i].getNome()+ " ha vinto la partita");
						break;
					}
				}
			}
			
		}
		while(cont==0);
		for(Giocatore a: Classifiche.StipulaClassifica(giocatori)){
			if(a!=null) {
				System.out.println(a.getNome() +" pos: "+a.getPosizione());
				
			}
		}
		sc.close();
	}

}
