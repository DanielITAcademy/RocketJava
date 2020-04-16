package PhaseTwo;

import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String slowDown;
		RocketTwo r1 = new RocketTwo ("LDSFJA32" );
		r1.getThursterList().add(new ThursterTwo(10));
		r1.getThursterList().add(new ThursterTwo(30));
		r1.getThursterList().add(new ThursterTwo(80));
		
		RocketTwo r2 = new RocketTwo ("32WESSDS");
		r2.getThursterList().add(new ThursterTwo(30));
		r2.getThursterList().add(new ThursterTwo(40));
		r2.getThursterList().add(new ThursterTwo(50));
		r2.getThursterList().add(new ThursterTwo(50));
		r2.getThursterList().add(new ThursterTwo(30));
		r2.getThursterList().add(new ThursterTwo(10));
		
	
		System.out.println(r1);
		System.out.println(r2);

		System.out.println("***********************");
		System.out.println("Are you ready? Let´s go");
		System.out.println("***********************");
		
		r1.PowerToTarget(15);
		r2.PowerToTarget(18);
		System.out.println("*****Press any letter to slow down*****");
		slowDown = sc.next();
		
		if(!slowDown.isEmpty());
		r1.PowerToTarget(4);
		r2.PowerToTarget(8); 
		
		
		}
	}
