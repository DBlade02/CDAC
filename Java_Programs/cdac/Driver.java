package cdac;

import cdac.hyd.dbda.*; // implicit
import cdac.hyd.dac.DAC;  //explicit


public class Driver {
	public static void main(String[] args) {
	
		DAC dac = new DAC(108);
		System.out.println(dac.getStregth()); // 108
		
		DBDA dbda = new DBDA(40);
		System.out.println(dbda.getStregth());
		
		cdac.acts.Training trng = new cdac.acts.Training(325);// FQN
		System.out.println(trng.getStregth());
		
	}

}
