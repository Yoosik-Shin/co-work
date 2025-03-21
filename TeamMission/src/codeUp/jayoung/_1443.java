package codeUp.jayoung;

import java.util.Scanner;

// 삽입정렬
// 오름차순 삽입 정렬은 '정렬된 데이터 셋에 뒤쪽에서 부터 원소를 하나씩 삽입하여 순서에 맞는 위치로 찾아가며 정렬하는 방식'이다.
// 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
// 이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
// 오름차순으로 정렬된 데이터가 출력된다. (개행)
// 입력 예시 5 1 3 2 5 4
public class _1443 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputIndex = sc.nextInt();

		int inputList[] = new int[inputIndex];

		for (int index = 0; index < inputList.length; index++) {
			inputList[index] = sc.nextInt();
		}

		sc.close();

		// 배열의 크기만큼 반복
		for (int index = 1; index < inputList.length; index++) {

			// 비교할 값 저장
			int key = inputList[index];

			int targetIndex = index - 1;

			// 비교할 값가 더 작은 값일 때, 그 값을 올바른 위치에 삽입하기 위해
			// 정렬된 부분의 원소들을 한 칸씩 뒤로 이동시킴
			while (targetIndex >= 0 && inputList[targetIndex] > key) {
				// 한 칸씩 뒤로 밀기
				inputList[targetIndex + 1] = inputList[targetIndex];
				targetIndex--;
			}

			// key를 정렬된 부분의 적절한 위치에 삽입
			inputList[targetIndex + 1] = key;
		}

		for (int indexInt : inputList) {
			System.out.println(indexInt);
		}
	}
}
