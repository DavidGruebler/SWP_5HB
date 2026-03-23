package innereKlassen.innere.typen;

public class University {
	
	public class Student{
		
		public void showData(String name, int id) {
			System.out.println(name + " mit der id: "+ id);
		}
	}
	

	public static void main(String[] args) {
		
        University uni = new University();
        University.Student student = uni.new Student();
        student.showData("Max Mustermann", 123456);

	}

}
