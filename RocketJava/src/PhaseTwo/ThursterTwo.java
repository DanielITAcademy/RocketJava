package PhaseTwo;

public class ThursterTwo implements Runnable {
	
	private static int COUNTER = 1;
	
	private int thrusterId; // para identificar yo mis rockets
	private int maxPower;
	private int currentPower;
	private int targetPower;
	
	public ThursterTwo(int maxPower) {
		
		this.thrusterId = COUNTER;
		COUNTER++;
		
		this.maxPower = maxPower;
		this.currentPower = 0;
		this.targetPower = 0;
		
		
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getCurrentPower() {
		return currentPower;
	}

	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}

	public int getTargetPower() {
		return targetPower;
	}

	public void setTargetPower(int targetPower) { //limitamos thurster
		if(targetPower>maxPower)
			this.targetPower = maxPower;
		else {	
		this.targetPower = targetPower;
		}
	}

	@Override
	public String toString() {
		return "ThursterTwo [id=" +thrusterId +" maxPower=" + maxPower + ", currentPower=" + currentPower + ", targetPower=" + targetPower
				+ "]";
	}

	@Override
	public void run() {
		
		try {
			if(currentPower<targetPower) {
				do {
					
					currentPower ++;
					System.out.println("Thruster: "+thrusterId+" ***** Current Power "+currentPower+" ***** Target power "+targetPower);
					Thread.sleep(300);
				} while (currentPower!=targetPower );
				System.out.println("Thruster: "+thrusterId+" have arrived Target Power "+targetPower);
			}else if (currentPower>targetPower) {
		do {
					
					currentPower --;
					System.out.println("Thruster: "+thrusterId+" ***** Current Power "+currentPower+" ***** Target power "+targetPower);
					Thread.sleep(300);
				} while (currentPower!=targetPower );
				System.out.println("Thruster: "+thrusterId+"have arrived Target Power "+targetPower);
				
			}else 
				System.out.println("Thurster can not accelerate, we have arrived at Power Target");
			//System.out.println("Thread started "+this.id +" with powerTarget " + targetPower + " of thurster");
			//Thread.sleep(1000);
			//System.out.println("Thread end "+this.id +" of thurster");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
