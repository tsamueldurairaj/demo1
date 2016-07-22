package javaOOPSConcepts;

public class Patterns {
	
int matrix[][]={{1,3,2,4},{2,1,3,7},{5,3,2,8},{1,3,4,9}};
int sum1,sum2;	
	
	void display(){
		for(int row=0; row<4; row++){
			for(int column=0; column<4; column++){
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
	}
	void addition(){
		
		sum1 =matrix[0][0]+matrix[0][1]+matrix[0][2]+matrix[0][3]+matrix[1][0]+matrix[2][0]+matrix[2][1]+matrix[1][2];
		 System.out.println(sum1);
	}

	public static void main(String[] args) {
      Patterns obj1 = new Patterns();
      obj1.display();
      obj1.addition();

	}

}
