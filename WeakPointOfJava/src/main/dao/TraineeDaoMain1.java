package ex5_1.main;

import java.util.Scanner;

import ex5.dao.TraineeDao;
import ex5.entity.Trainee;

public class TraineeDaoMain1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("研修生IDを入力してください");
		System.out.print("→");
		int id = s.nextInt();
		TraineeDao dao = new TraineeDao();
		Trainee trainee = dao.searchById(id);
		if (trainee != null) {
//			System.out.println("研修生ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢："
//					+ trainee.getAge() + " 性別：" + trainee.getGender() + " 単元ID：" + trainee.getUnitId()
//					+ " 会社ID：" + trainee.getCoId());
			System.out.println("研修生ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢：");
		}
	}
}
