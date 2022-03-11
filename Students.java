package student.information;

public class Students {

	public void getStudentInfo(int Id) {
		System.out.println(Id);
	}
	public void getStudentInfo(int Id,String Name) {
    System.out.println(Id+Name);	
    }
	public void getStudentInfo(String Email,long PhoneNumber) {
		System.out.println(Email+PhoneNumber);
	}

	public static void main(String[] args) {
		Students info = new Students();
	info.getStudentInfo(1234);
	info.getStudentInfo(1234, " kavya");
	info.getStudentInfo("ajddasf@gmail.com",  9876543210L);

	}

		
	}


