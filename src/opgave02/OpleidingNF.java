package opgave02;

public class OpleidingNF extends Opleiding implements NumerusFixus {

	public OpleidingNF(String naam, String plaats) {
		super(naam, plaats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean toelatenStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean studentBSA(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
