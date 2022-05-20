import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
	greeting();
	}

	public static void greeting(){
		System.out.println("Please Enter Your Name");
		Scanner input = new Scanner(System.in);
		String name =  input.nextLine();
		System.out.println("Hello "+ name + "!!");

	}
}