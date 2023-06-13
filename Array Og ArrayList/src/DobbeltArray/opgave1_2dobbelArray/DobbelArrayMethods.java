package DobbeltArray.opgave1_2dobbelArray;

import java.util.Collections;

/**
 * @author mad
 *
 */
public class DobbelArrayMethods {

	int value = 0;


	public void udskrivArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "  ");
			}
			System.out.println();
		}
	}

	// Opgave 1.1
	public  int getValueAt(int[][] numbers, int row, int col){
		return numbers[row][col];
	};

	// Opgave 1.2
	public  void setValueAt(int[][] numbers, int row, int col, int value){
		numbers[row][col]=value;
	}

	// Opgave 1.3
	public  int sumRow(int[][] numbers, int row) {
		int sum = 0;
		for (int j = 0; j < numbers[row].length; j++) {
			sum = sum + numbers[row][j];
		}
		return sum;
	}

	// Opgave 1.4
	public  int sumCol(int[][] numbers, int col) {
		int sum = 0;
		for (int[] number : numbers) {
			sum = sum + number[col];
		}
		return sum;
	}

	// Opgave 1.5
	public  int sum(int[][] numbers) {
		int sumForAll = 0;
		for(int i =0; i < numbers.length;i++ ){
			for(int j = 0; j<numbers[0].length;j++){
				sumForAll += numbers[i][j];
			}
		}
		return sumForAll;
	}
}
