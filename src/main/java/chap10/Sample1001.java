package chap10;

public class Sample1001 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ドライバーロードに成功しました");
		} catch(ClassNotFoundException e) {
			System.out.println("ドライバーロードに失敗しました");
		}

	}

}
