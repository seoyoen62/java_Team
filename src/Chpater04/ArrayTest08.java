package Chpater04;

public class ArrayTest08 {

	public static void main(String[] args) {

	/*for 이용
	 * score점수 출력=>score[0]:98
	 * sum변수방에 점수 누적
	 * avg변수방에 선언후 평균 출력(단 실수타입)
	 */
		
		int score[]= {98,90,87};
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
			sum+=score[i];
		}
		
		//sum총점
		System.out.println("총점:"+sum);
		//avg평균 구현후 출력 (단 avg는 실수)
		double avg=sum/(double)(score.length);
		System.out.println("평균:"+avg);
		System.out.println(Math.round(avg));

	}

}
