package singletonPattern;

public class DBConn {

	static private DBConn instance = new DBConn();

	private DBConn() {

	}

	public static DBConn getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(DBConn.getInstance());
	}

}
