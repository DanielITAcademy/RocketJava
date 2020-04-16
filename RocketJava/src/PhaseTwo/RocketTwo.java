package PhaseTwo;

import java.util.ArrayList;
import java.util.List;

public class RocketTwo {

	private String code;
	private List<ThursterTwo> thursterList;
	
	public RocketTwo(String code) {
		super ();
		this.code = code;
		this.thursterList = new ArrayList<ThursterTwo>(); //genero lista vacia de rockets si quiero hacer una lista la haria con el set de abajo
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ThursterTwo> getThursterList() {
		return thursterList;
	}

	public void setThursterList(List<ThursterTwo> thursterList) {
		this.thursterList = thursterList;
	}

	public void PowerToTarget(int targetPower) {
		for (ThursterTwo thursterTwo : thursterList) {
			thursterTwo.setTargetPower(targetPower);
			Thread t = new Thread(thursterTwo); // creo un objeto hilo entre parentesis me pide el objeto con el runnable
			t.start();
		}
	
	}
	@Override
	public String toString() {
		return "RocketTwo [code=" + code + ", thursterList=" + thursterList + "]";
	}
	
	
}
