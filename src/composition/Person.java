package composition;

public class Person {
    private Job job;
    
    public Person(){
        this.job = new Job();
        job.setSalary(1000);
        job.setRole("Manager");
        
    }
    
    public long getSalary() {
        return job.getSalary();
    }
    public String getRole() {
        return job.getRole();
    }
}
