package simulatore;
import giocodellocares.*;
public class Classifiche {
	public static Giocatore[] classifica=new Giocatore[4];
	
	
	public static Giocatore[] StipulaClassifica(Giocatore[] gruppo) {
		Giocatore[] res=new Giocatore[gruppo.length];
		
		for(int j=0;j<gruppo.length;j++) {
			Giocatore max=new Giocatore();
			for(int i=0;i<gruppo.length;i++) {
				if(gruppo[i]!=null) {
					if(gruppo[i].getPosizione()>max.getPosizione()) {
						max=gruppo[i];
					}
				}
			}
			for(int i=0;i<gruppo.length;i++) {
				if(gruppo[i]!=null) {
					if(max.equals(gruppo[i])) {
						gruppo[i]=null;
						res[j]=max;
						break;
					}
				}
			}
		}
		return res;
	}
}
	

