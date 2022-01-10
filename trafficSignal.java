package traffic;
import java.util.Scanner;
public class trafficSignal {
	public static void main(String[] args) {
		String color;
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter color");
		color = scanner1.next();
		switch(color)
		{
		case "a":	
		case "b":
		case "c":
		case "d":
		case "e":
		System.out.println("stop!");
		break;
		case "f":
		case "g":
		case "h":
		case "i":
		case "j":
			System.out.println("Ready !");
	break;
		case "k":
		case "l":
		case "m":
		case "n":
		case "o":
			System.out.println("Go.....");
		break;
		default:
			System.out.println("invalid input");
		}

}}