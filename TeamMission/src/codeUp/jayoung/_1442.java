package codeUp.jayoung;

import java.util.Scanner;

// 선택정렬
// 오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고,
// 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고, ... 이런식으로 정렬하는 방식'이다.
// 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
// 이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
// 오름차순으로 정렬된 데이터가 출력된다. (개행)
// 입력 예시 5 1 3 2 5 4
public class _1442 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputIndex = sc.nextInt();

		int inputList[] = new int[inputIndex];

		for (int index = 0; index < inputList.length; index++) {
			inputList[index] = sc.nextInt();
		}

		sc.close();

		// 배열의 크기만큼 반복
		for (int row = 0; row < inputList.length - 1; row++) {

			// 가장 작은 값의 인덱스를 저장
			int minIndex = row;

			// row + 1부터 끝까지 반복하면서 가장 작은 값의 인덱스를 찾음
			for (int col = row + 1; col < inputList.length; col++) {
				if (inputList[col] < inputList[minIndex]) {
					minIndex = col; // 더 작은 값을 찾으면 minIndex를 갱신
				}
			}

			// 가장 작은 값과 i번째 원소를 교환
			if (minIndex != row) {
				int temp = inputList[row];
				inputList[row]      = inputList[minIndex];
				inputList[minIndex] = temp;
			}
		}

		for (int indexInt : inputList) {
			System.out.println(indexInt);
		}
	}
}
