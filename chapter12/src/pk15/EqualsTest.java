package pk15;

public class EqualsTest {
	public static void main(String[] args) {
		Student std = new Student(202106, "����ȣ");
		Student std2 = std;
		Student std3 = new Student(202106, "����ȣ");

		System.out.println("===������ �ּ��� �� �ν��Ͻ� ��===");
		
		if (std == std2) {
			System.out.println("std�� std2�� �ּҰ� �����ϴ�. ");
		} else {
			System.out.println("std�� std2�� �ּҰ� �ٸ��ϴ�. ");
		}

		if (std.equals(std2)) {
			System.out.println("std�� std2�� ������ �����ϴ�. ");
		} else {
			System.out.println("std�� std2�� ������ �ٸ��ϴ�. ");
		}

		
		
		System.out.println("===�ٸ� �ּ��� �� �ν��Ͻ� ��===");

		if (std2 == std3) {
			System.out.println("std�� std3�� �ּҰ� �����ϴ�. ");
		} else {
			System.out.println("std�� std3�� �ּҰ� �ٸ��ϴ�. ");
		}

		if (std2.equals(std3)) {
			System.out.println("std�� std3�� ������ �����ϴ�. ");
		} else {
			System.out.println("std�� std3�� ������ �ٸ��ϴ�. ");
		}
	}
}
