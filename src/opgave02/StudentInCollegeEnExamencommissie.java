package opgave02;

public class StudentInCollegeEnExamencommissie extends Student implements Collegevanbestuurlid, Examencommissielid {

	public StudentInCollegeEnExamencommissie(String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beoordelenKlacht(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beoordelenCijfer(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afgevenGetuigschrift(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aannemenMedewerkers(Persoon persoon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewakenKwaliteit(Opleiding opleiding) {
		// TODO Auto-generated method stub

	}

}
