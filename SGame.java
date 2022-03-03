import java.util.*;
import java.util.Scanner;
public class SGame {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		Player1 p1 = new Player1( "Ram", "Sword",100);
		Player2 p2 = new Player2( "Sam", "Sword",100, true);
		System.out.println("1.Player-1 Name - "+p1.getName());
		System.out.println("2.Player-1 Health - "+p1.getHealth());
		System.out.println("3.Player-2 Name - "+p2.getName());
		System.out.println("4.Player-2 Health - "+p2.getHealth());
		System.out.println("Shall we play a game    - Y/N");
		char ch=sc.next().charAt(0);
		if(ch=='Y'|| ch=='y') {
			System.out.println("1. Player 1 will Shoot Palyer 2 \n2. Player 2 will Shoot Palyer 1 \n3. Player 1 will Shoot Palyer 2 with power Weapon"
					+ "\n4. Player 2 will Shoot Palyer 1 with power Weapon \n5. Player 1 will get health Booster \n6. Player 1 will get health Booster "
					+ "\n7. To end the game");
			System.out.println("Enter the option");
			int n= sc.nextInt();
			while(n!=0) {	
				if(n>=1 && n<=7) {
			switch(n){
			case 1:p2.shotbyGun1();break;
			case 2:p1.shotbyGun1();break;
			case 3:p2.shotbyGun2();break;
			case 4:p1.shotbyGun2();break;
			case 5:p1.heal();break;
			case 6:p2.heal();break;
			case 7:System.out.println("Bye Bye :)");break;
			default:System.out.println("Enter values between 1 to 7");
			}
			System.out.println("Enter the option");
			 n= sc.nextInt();
		}
				else {
					System.out.println("Game over");
					break;
				}
				}
			sc.close();
	}
					
	}

}
