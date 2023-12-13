package EX1;

public class CondtionAge implements ConditionAcces {
	private int AgeMin;
	CondtionAge(int AgeMin)
	{
		this.AgeMin=AgeMin;
	}
	@Override
	public boolean accesPossible(Personne p) {
		// TODO Auto-generated method stub
		if(p.getAge()>this.AgeMin) {
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override 
	public String toString() {
		return "Age:"+AgeMin;
	}
	

}
