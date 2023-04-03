public class MartrixCalculator{
	
	public static void main(String[]args){
		int[][] A = {{1,0,2}, {-1,3,1}}; //2X3크기의 배열 선언
		int[][] B = {{3,1}, {2,1}, {1,0}}; //3X2크기의 배열 선언
		int[][] C = new int[2][2]; //결과를 저장할 2X2크기의 배열 선언
		
		for(int i=0; i<2; i++){ //3중 for문을 활용하여 행렬의 곱셈 계산
			for(int j=0; j<2; j++){
				int multiply = 0;
				for(int k=0; k<3; k++){
					multiply += A[i][k] * B[k][j];
					}
				C[i][j] = multiply; //결과를 배열 C에 저장
				}
			}
		
		for(int m=0; m<2; m++){ //for문을 통해 결과 출력
			for(int n=0; n<2; n++){
				System.out.print(C[m][n] + " ");
				}
			System.out.println();
		}
	}
}