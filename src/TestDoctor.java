
public class TestDoctor {

	public static void main(String[] args) {
		Specialist spObj =new Specialist("Mary", 1234,"New York","Medicine");
		spObj.display();
		NonSpecialist nonspObj = new NonSpecialist("John",5231,"Sydney");
		nonspObj.display();

	}

}
