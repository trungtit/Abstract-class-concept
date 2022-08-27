package student_info_manager;

public abstract class UniversityStudent {

	public UniversityStudent() {
	}

	String stName;
	String stId;
	byte age;
	String dep;
	
	public abstract void setName(String name);
	public abstract void setId(String id);
	public abstract void setAge(Byte age);
	public abstract void setDep(String dep);
	
	
	
	public abstract String getName(); 
	public abstract String getId(); 
	public abstract Byte getAge(); 
	public abstract String getDep();
	protected abstract String getCourseInfo(); 

}
