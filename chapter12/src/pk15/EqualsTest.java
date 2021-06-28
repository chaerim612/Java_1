package pk15;

public class EqualsTest {
	public static void main(String[] args) {
		Student std = new Student(202106, "마적호");
		Student std2 = std;
		Student std3 = new Student(202106, "마적호");

		System.out.println("===동일한 주소의 두 인스턴스 비교===");
		
		if (std == std2) {
			System.out.println("std와 std2는 주소가 같습니다. ");
		} else {
			System.out.println("std와 std2는 주소가 다릅니다. ");
		}

		if (std.equals(std2)) {
			System.out.println("std와 std2는 내용이 같습니다. ");
		} else {
			System.out.println("std와 std2는 내용이 다릅니다. ");
		}

		
		
		System.out.println("===다른 주소의 두 인스턴스 비교===");

		if (std2 == std3) {
			System.out.println("std와 std3는 주소가 같습니다. ");
		} else {
			System.out.println("std와 std3는 주소가 다릅니다. ");
		}

		if (std2.equals(std3)) {
			System.out.println("std와 std3는 내용이 같습니다. ");
		} else {
			System.out.println("std와 std3는 내용이 다릅니다. ");
		}
	}
}
