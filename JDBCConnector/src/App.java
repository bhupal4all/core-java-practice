import java.sql.SQLException;
import java.util.List;

public class App {

	public static void main(String[] args) {
		JDBCConnector conn = new JDBCConnector();
		List list = null;
		try {
			list = conn.directSQLQuery("select * from c_returns", null, ReturnsData.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(list);
	}

}
