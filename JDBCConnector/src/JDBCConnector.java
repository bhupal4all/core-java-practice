import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCConnector {

	public Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@10.80.16.214:1521:CSO11203A";
		String username = "GLOBWMSDEV";
		String password = "GLOBWMSDEV";
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public List directSQLQuery(String query, Map<Integer, String> parms, Class outputClass) throws SQLException {
		List retList = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Object obj = getObjectFromRS(rs, outputClass);
				retList.add(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();

			if (stmt != null)
				stmt.close();

			if (conn != null)
				conn.close();
		}

		return retList;
	}

	protected Object getObjectFromRS(ResultSet rs, Class targetClass) {

		// GLOBCReturnsData obj = new GLOBCReturnsData();
		// try {
		// obj.setReturnId(rs.getInt(obj.getColumnName("returnId")));
		// obj.setReturnNbr(rs.getString(obj.getColumnName("returnNbr")));
		// obj.setRetrndQty(rs.getLong(obj.getColumnName("retrndQty")));
		// obj.setShippedDate(rs.getTimestamp(obj.getColumnName("shippedDate")));
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		
		Object obj = null;

		try {
			obj = targetClass.newInstance();
						
			Method getColumnName = targetClass.getDeclaredMethod("getColumnName", String.class);
			for (Field f : targetClass.getDeclaredFields()) {
				String propName = f.getName();
				String colName = (String) getColumnName.invoke(obj, propName);

				if (!colName.isEmpty()) {
					Object val = rs.getObject(colName);
					f.setAccessible(true);
					f.set(obj, val);
				}
			}
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | SQLException | InstantiationException e) {
			e.printStackTrace();
		}

		return obj;
	}
}
