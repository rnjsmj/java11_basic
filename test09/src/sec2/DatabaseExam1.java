package sec2;

public class DatabaseExam1 {

	public static void main(String[] args) {
		
		Database db; //객체선언
		//추상체로 생성자 생성 불가
		//생성자의 인수로 구현하면 생성 가능
		//db = new Database();
		
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", "where title like \'%알림%\'");
		
		System.out.println("\nMySQL");
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", " where title like \'%알림%\'");
		
		System.out.println("\nMariaDB");
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", " where title like \'%알림%\'");
	}

}
