
public class ClassMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethodsDemo m = new ClassMethodsDemo();
		String name = m.getdata();
		System.out.println(name);
		Methods2Demo d = new Methods2Demo();
		d.getuserdata();
		ClassMethodsDemo s = new ClassMethodsDemo();
		s.secondgetdata();

	}
	
	public String getdata() 
	{
		System.out.println("Hello world");
		return "Elayaraja";
		
	}
	
	public void secondgetdata()
	{
       System.out.println("second methods");
    }
	
}


