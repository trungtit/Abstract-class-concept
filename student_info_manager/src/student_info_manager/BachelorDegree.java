package student_info_manager;

public class BachelorDegree extends UniversityStudent {

	public BachelorDegree() {

	}
	private final String DEGREE_COURSE = "Bachelor";
	@Override
	public void setName(String name) {
		this.stName = name;
		
	}
	@Override
	public void setId(String id) {
		this.stId = id;
	}
	@Override
	public void setAge(Byte age) {
		this.age = age;
	}
	@Override
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String getName() {
		return stName;
	}
	@Override
	public String getId() {
		return stId;
	}
	@Override
	public Byte getAge() {
		return age;
	}
	@Override
	public String getDep() {
		return dep;
	}
	public String getCourseInfo() {
		return DEGREE_COURSE;
	}
}
