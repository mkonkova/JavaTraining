
public class NjTax extends Tax {
	public double adjustForStudents(double tax){
		return tax-500;
	}
	
	NjTax (double gi, String st, int depen){
		 grossIncome = gi; // class variable initialization
		 state = st;
		 numberOfDependents=depen;
		 }	
	
	public double calcTax(){
		if (grossIncome<50000){
			return grossIncome*0.10;
		}
		else{
			return grossIncome*0.13;
		}
	}	

}
