
public class Person5 {

	private Job job;//composition has relationship
	
	public Person5()
	{
		this.job=new Job();
		job.setSalary(1000L);
	    job.setId(101);
	    job.setRole("Manager");
	}
	
	public void dispDetails()
	{
		System.out.println(job.getId()+" "+job.getSalary());
	}
}
