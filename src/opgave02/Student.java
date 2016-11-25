package opgave02;

public class Student extends Persoon {

	private Opleiding opleiding;

	public Student(String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		this.opleiding = opleiding;
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " is een student. ");
	}

}
