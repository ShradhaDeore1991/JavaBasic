package program;
import java.util.Scanner;

public class Quadrant {


	public class Main {
		int determineQuadrant(int X, int Y) {
			if (X == 0 && Y == 0)
				return 0;
			else if (X > 0 && Y > 0)
				return 1;
			else if (X < 0 && Y > 0)
				return 2;
			else if (X < 0 && Y < 0)
				return 3;
			else if (X > 0 && Y < 0)
				return 4;
			return -1;
		}

		public void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int X=0;
			int Y=0;

			int ret = 0;
			try {
				System.out.printf("Enter the value of X: ");
				X = Integer.parseInt(sc.next());
				System.out.printf("Enter the value of Y: ");
				Y = Integer.parseInt(sc.next());

				if (X < 0 && Y<0 ) {
					throw new IllegalArgumentException();
				}

			}catch (Exception e){
				System.out.println("Invalid Input");
				System.out.println("Please,enter valid Input");

				System.out.printf("Enter the value of X: ");
				X = Integer.parseInt(sc.next());
				System.out.printf("Enter the value of Y: ");
				Y = Integer.parseInt(sc.next());

			}
			ret = determineQuadrant(X, Y);

			if (ret == 0)
				System.out.printf("Point (%d, %d) lies at the origin\n", X, Y);
			else if (ret == 1)
				System.out.printf("Point (%d, %d) lies in the First quadrant\n", X, Y);
			else if (ret == 2)
				System.out.printf("Point (%d, %d) lies in the Second quadrant\n", X, Y);
			else if (ret == 3)
				System.out.printf("Point (%d, %d) lies in the Third quadrant\n", X, Y);
			else if (ret == 4)
				System.out.printf("Point (%d, %d) lies in the Fourth quadrant\n", X, Y);
		}
	}
}

