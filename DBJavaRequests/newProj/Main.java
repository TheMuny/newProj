package newProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/TheMunyDataBase";

    static final String USER = "postgres";
    static final String PASS = "neversoft";
    
    
	public static void main(String[] args) {
		Connection conn = null;
        Statement stmt = null;
        try{
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected");
        Statement stm = conn.createStatement();

        ResultSet res = stm.executeQuery("select * from \"АвтоВладельцы\",\"Транспорт\"");
            
        ResultSet res1 = stm.executeQuery("select * from \"АвтоВладельцы\",\"Транспорт\" "
        		+ "where \"фамилия\" = 'Старнов'AND  \"АвтоВладельцы\".primary_id = \"Транспорт\".\"foreignId\"");

        ResultSet res2 = stm.executeQuery("select \"АвтоВладельцы\".\"фамилия\",\"Транспорт\".\"марка_автомобиля\", \"Транспорт\".\"номерной_знак\""
        		+ "from \"АвтоВладельцы\", \"Транспорт\" where номерной_знак Like '%ХА%'AND \"АвтоВладельцы\".primary_id = \"Транспорт\".\"foreignId\"");
            
        ResultSet res3 = stm.executeQuery("select * from \"Транспорт\" "
        		+ "where \"Транспорт\".\"дата_прохождения_последнего_ТО\" < '2015-10-10'");
       
//      ResultSet res4 = stm.executeQuery("");
//        
//      ResultSet res5 = stm.executeQuery("");
        
        conn.close();
        
	}catch(Exception ex){
		ex.printStackTrace();
	}

}
}