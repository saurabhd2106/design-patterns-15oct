package prototype;

public class Client {

	public static void main(String[] args) throws Exception {

		Swodsman s1 = new Swodsman();
		
		s1.move(new Point3D(-10, 0, 0), 20);
		
		s1.attack();

		Swodsman s2 = (Swodsman) s1.clone();
		
		System.out.println(s1);
		
		System.out.println("cloned object " + s2);

	}

}
