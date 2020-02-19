package kh.java.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialTest {

	public void main() {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:/Users/user1/Desktop/object.txt"));
			ArrayList<User> list = new ArrayList<User>();

			Score score = new Score(100, 100, 100);
			User user1 = new User("test1", "1234", 1234, score);
			User user2 = new User("test2", "1234", 1234, score);
			User user3 = new User("test3", "1234", 1234, score);

			list.add(user1);
			list.add(user2);
			list.add(user3);

			oos.writeObject(list);
			System.out.println("저장완료");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readObject() {

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("C:/Users/user1/Desktop/object.txt"));

			ArrayList<User> list = (ArrayList<User>) ois.readObject();

			// User user = (User)ois.readObject();

			for (User user : list) {
				System.out.println("ID : " + user.getId());
				System.out.println("PW : " + user.getPw());
				System.out.println("나이 : " + user.getAge());
				System.out.println("국어 점수 : " + user.getScore().getKor());
				System.out.println("수학 점수 : " + user.getScore().getMath());
				System.out.println("영어 점수 : " + user.getScore().getEng());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
