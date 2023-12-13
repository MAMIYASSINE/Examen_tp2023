package EX1;

public class ParcAttraction {
	private Attraction lesAttraction[];
	private String nom;
	private int nb_attraction=0;
	public int taille;
	
	public ParcAttraction(String nom,int taille){
		this.nom=nom;
		this.taille=taille;
		lesAttraction=new Attraction[taille];
	}
	public void ajouteAttraction(Attraction att) {
		if(nb_attraction<taille) {
			lesAttraction[nb_attraction]=att;
			nb_attraction++;
		}
		else
		{
			System.out.println("On ne peut pas ajouter une autre attraction");
		}
	}
	public float getRecette(){
		float s=0;
		for(int i=0;i<nb_attraction;i++) {
			s=s+lesAttraction[i].getRecette();
		}
		return s;
	}
	public String affichattractions(){
		String ch="";
		for(int i=0;i<nb_attraction;i++) {
			ch=ch+" Nom: "+lesAttraction[i].getNom()+" "+lesAttraction[i].getConditionage()+" Recette: "+lesAttraction[i].getRecette()+" ";
					
		}
		return ch;
	}
	@Override
	public String toString() {
		return "Nom du parc: "+nom+" "+this.affichattractions();
	}
	public void affiche() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ParcAttraction parc=new ParcAttraction("AA",10);
		
		Attraction att1=new Attraction("aa",17,new CondtionAge(18));
		Attraction att2=new Attraction("zzz",25,new CondtionAge(20));
		Attraction att3=new Attraction("eeee",40,new CondtionAge(35));
		parc.ajouteAttraction(att1);
		parc.ajouteAttraction(att2);
		parc.ajouteAttraction(att3);
		Personne p1=new Personne(15,165,"AA");
		Personne p2=new Personne(45,180,"ZZ");
		Personne p3=new Personne(30,175,"EE");
		Personne p4=new Personne(26,177,"RR");
		Personne p5=new Personne(25,174,"TT");
		Personne p6=new Personne(20,180,"YY");
		Personne p7=new Personne(40,172,"UU");
		Personne p8=new Personne(28,170,"II");
		try
		{
			att1.utilise(p2);
			att1.utilise(p3);
			att1.utilise(p5);
			att1.utilise(p6);
			att1.utilise(p7);
			att1.utilise(p1);
		}
		catch(AccesInterditException a) {
			System.out.print(a.fillInStackTrace());
		}
		try
		{
			att2.utilise(p8);
			att2.utilise(p3);
			att2.utilise(p4);
			att2.utilise(p7);
			att2.utilise(p5);

		}
		catch(AccesInterditException a){
			System.out.print(a.fillInStackTrace());
		}
		try {
			att3.utilise(p2);
			att3.utilise(p8);
		}
		catch(AccesInterditException a){
			System.out.print(a.fillInStackTrace());
		}
		parc.affiche();
		System.out.println("Recette globale:"+parc.getRecette());
		
		
		
		

	}

}
