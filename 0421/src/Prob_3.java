import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		Grade me = new Grade ();
		me.math = Scanner.nextInt();
		me.science = Scanner.nextInt();
		me.english = Scanner.nextInt();
		System.out.println("평균은" + me.average());
		
		
		
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
		
		
	}
}