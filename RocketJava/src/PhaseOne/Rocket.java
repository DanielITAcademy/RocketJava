package PhaseOne;

public class Rocket {

	
	private String code;
	private int numThrusters;
	public Rocket(String code, int numThrusters) {
	
		this.code = code;
		this.numThrusters = numThrusters;

	}
	@Override
	public String toString() {
		return "Rocket [code=" + code + ", numThrusters=" + numThrusters + "]";
	}
	
	
	
	
	
	
}
