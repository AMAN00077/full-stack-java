package abstraction.sport;

public class Cricket implements Coach{
	@Override
	public void getexe() {
		System.out.println("Running");
		
		
	}
	@Override
	public void getpractice() {
		System.out.println("Yoga");
		
		
	}
	@Override
	public String getBreakfast() {
		// TODO Auto-generated method stub
		return "potato";
	}
	
	@Override
	public String getLunch() {
		// TODO Auto-generated method stub
		return null;
	}

}
