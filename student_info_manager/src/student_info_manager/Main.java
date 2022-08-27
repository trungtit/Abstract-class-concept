package student_info_manager;

public class Main {
	
	public static void data1() {
		UniversityStudent st1 = new MasterDegree();
		st1.setName("TrungTiT");
		st1.setAge((byte) 23);
		st1.setId("2018142060");
		st1.setDep("SW Development");

		System.out.println(st1.getName());
		System.out.println(st1.getId());
		System.out.println(st1.getAge());
		System.out.println(st1.getDep());
		System.out.println(st1.getCourseInfo());
	}
	public static void data2() {	
		UniversityStudent st2 = new BachelorDegree();
		st2.setName("TrungLee");
		st2.setAge((byte) 24);
		st2.setId("2018142061");
		st2.setDep("SW engineering");

		System.out.println(st2.getName());
		System.out.println(st2.getId());
		System.out.println(st2.getAge());
		System.out.println(st2.getDep());
		System.out.println(st2.getCourseInfo());
		
	}

	public static void getData() {
		
		System.out.println("*********Student 1 Info: **********");
		data1();
		System.out.println("*********Student 2 Info: **********");
		data2();
	}
	
	public static void main(String[] args) {
		getData();
	}
}
