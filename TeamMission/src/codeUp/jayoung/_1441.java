package codeUp.jayoung;

import java.util.Scanner;

// 버블 정렬
// 버블 정렬은 '인접한 두 원소를 검사하여 자리를 바꿔가며 정렬하는 방식'이다.
// 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
// 이 프로그램은 버블 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
// 오름차순으로 정렬된 데이터가 출력된다. (개행)
// 입력 예시 5 1 3 2 5 4
public class _1441 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputIndex = sc.nextInt();

		int inputList[] = new int[inputIndex];

		for (int index = 0; index < inputList.length; index++) {
			inputList[index] = sc.nextInt();
		}

		sc.close();

		// 배열의 크기만큼 반복
		for (int row = 0; row < inputList.length; row++) {

			// 마지막 i개의 원소는 이미 정렬되었으므로 제외
			for (int col = 0; col < inputList.length - row - 1; col++) {

				if (inputList[col] > inputList[col + 1]) {
					int temp = inputList[col + 1];
					inputList[col + 1] = inputList[col];
					inputList[col]     = temp;
				}
			}
		}

		for (int indexInt : inputList) {
			System.out.println(indexInt);
		}
	}
}
