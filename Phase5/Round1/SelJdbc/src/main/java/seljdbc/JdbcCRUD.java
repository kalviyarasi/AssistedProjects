package seljdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCRUD {
	public int insert(User user) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dBConn();
		String sql="insert into User values(?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,user.getUsername());
		return ps.executeUpdate();
	}

}
