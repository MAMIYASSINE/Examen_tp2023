package EX1;

public class Attraction {

	private String nom;
	private float cout;
	CondtionAge conditionage;
	private int nbpersonnes=0;
	private float recette=0;
	public Attraction(String nom, float cout, CondtionAge conditionage) {
		super();
		this.nom = nom;
		this.cout = cout;
		this.conditionage = conditionage;
	}
	@Override
	public String toString() {
		return "Attraction [nom=" + nom + ", cout=" + cout + ", conditionage=" + conditionage + ", nbpersonnes="
				+ nbpersonnes + ", recette=" + recette + "]";
	}
	public void affiche() {
		System.out.println(this);
	}
	public  void utilise(Personne p) throws AccesInterditException{
		
		if(conditionage.accesPossible(p)==false) {
			throw new AccesInterditException("Acces interdit");
		}
		else
		{
			nbpersonnes++;
			recette=recette+this.cout;
			
		}
	}
	public float getRecette() {
		return this.recette;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public CondtionAge getConditionage() {
		return conditionage;
	}
	public void setConditionage(CondtionAge conditionage) {
		this.conditionage = conditionage;
	}
	
	
	
}
