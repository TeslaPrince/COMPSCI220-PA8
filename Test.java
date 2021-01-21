package PA8;
import java.util.Arrays;

public class Test {

	private static void print(int[][] A) {
		for (int r = 0; r < A.length; r++)
			System.out.println(Arrays.toString(A[r]));
	}

	private static void testJaggedSum1() {
		System.out.println("*** Test Jagged Array Sum 1 ***\n");
		int[] row00 = { 1, 3, 7, 9 };
		int[] row01 = { 41, -3, 2 };
		int[] row02 = {};
		int[] row03 = { 10, 20, 30 };
		int[] row04 = { 1 };
		int[][] jagged0 = { row00, row01, row02, row03, row04 };

		int[] row10 = { -1 };
		int[] row11 = { 0, 7, 8, 91, -4 };
		int[] row12 = { 1, 5, -8 };
		int[] row13 = { -10, -20, -30 };
		int[] row14 = {};
		int[][] jagged1 = { row10, row11, row12, row13, row14 };

		System.out.println("Sum of\n");
		print(jagged0);
		System.out.println("\nand\n");
		print(jagged1);
		System.out.println("\nis\n");
		print(Array2d.add(jagged0, jagged1));
	}

	private static void testJaggedSum2() {
		System.out.println("\n*** Test Jagged Array Sum 2 ***\n");
		int[] row00 = { 1, 3, 7, 9 };
		int[] row01 = { 41, -3, 2 };
		int[] row02 = { 47, 23 };
		int[][] jagged0 = { row00, row01, row02 };

		int[] row10 = { -1 };
		int[] row11 = { 0, 7, 8, 91, -4 };
		int[] row12 = {};
		int[] row13 = { -10, -20, -30 };
		int[] row14 = {};
		int[][] jagged1 = { row10, row11, row12, row13, row14 };

		System.out.println("Sum of\n");
		print(jagged0);
		System.out.println("\nand\n");
		print(jagged1);
		System.out.println("\nis\n");
		print(Array2d.add(jagged0, jagged1));
	}

	private static void testJaggedSum3() {
		System.out.println("\n*** Test Jagged Array Sum 3 ***\n");
		int[] row00 = { 1, 3, 7, 9 };
		int[] row01 = { 41, -3, 2 };
		int[] row02 = {};
		int[] row03 = { 10, 20, 30 };
		int[] row04 = { 1 };
		int[][] jagged0 = { row00, row01, row02, row03, row04 };

		int[] row10 = { -1 };
		int[] row11 = { 0, 7, 8, 91, -4 };
		int[][] jagged1 = { row10, row11, };

		System.out.println("Sum of\n");
		print(jagged0);
		System.out.println("\nand\n");
		print(jagged1);
		System.out.println("\nis\n");
		print(Array2d.add(jagged0, jagged1));
	}

	private static void shiftRowsDown() {
		int[] row00 = { 1, 3, 7, 9 };
		int[] row01 = { 41, -3, 2 };
		int[] row02 = {};
		int[] row03 = { 10, 20, 30 };
		int[] row04 = { 1 };
		int[][] jagged = { row00, row01, row02, row03, row04 };

		System.out.println("*** Original Jagged Array ***\n");
		print(jagged);
		System.out.println("\n*** After shifting rows down ***\n");
		Array2d.shiftRowsDown(jagged);
		print(jagged);
	}

	private static void testOrthogonal() {
		int[][] nonsquare = { { 0, 0, 0, 1 }, { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0 } };

		System.out.println("*** Jagged Array ***\n");
		print(nonsquare);
		System.out.println();
		System.out.println(Array2d.isOrthogonal(nonsquare) ? "is orthogonal " : "is not orthogonal");

		System.out.println("\n*** Square Matrix 1 ***\n");
		int[][] orthogonal = { { 0, 0, 0, 1 }, { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 1, 0, 0 } };
		print(orthogonal);
		System.out.println();
		System.out.println(Array2d.isOrthogonal(orthogonal) ? "is orthogonal " : "is not orthogonal");

		System.out.println("\n*** Square Matrix 2 ***\n");
		int[][] nonOrthogonal = { { 0, 1, 0, 1 }, { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 1, 0, 0 } };
		print(nonOrthogonal);
		System.out.println();
		System.out.println(Array2d.isOrthogonal(nonOrthogonal) ? "is orthogonal " : "is not orthogonal");

		System.out.println("\n*** Square Matrix 3 ***\n");
		orthogonal = new int[][] { { 1, 0 }, { 0, -1} };
		print(orthogonal);
		System.out.println();
		System.out.println(Array2d.isOrthogonal(orthogonal) ? "is orthogonal " : "is not orthogonal");
	}

	public static void main(String[] args) {
		shiftRowsDown();
		System.out.println("\n**********************************************\n");
		testJaggedSum1();
		testJaggedSum2();
		testJaggedSum3();
		System.out.println("\n**********************************************\n");
		testOrthogonal();
	}
}