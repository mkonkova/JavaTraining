
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax t=new Tax();
		
		t.grossIncome=50000;
		t.numberOfDependents=2;
		t.state="NJ";
		
		double yourTax=t.calcTax();
		
		System.out.println("Your tax is  " + yourTax);
		
		NjTax njt= new NjTax(50000,"NJ",2 );		

		
		double yourNjTax=njt.calcTax();
		double yourAdjustTax=njt.adjustForStudents(yourNjTax);
		
		System.out.println("Your tax is  " + yourAdjustTax);
		

	}

}
