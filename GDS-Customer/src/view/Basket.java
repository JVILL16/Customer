package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Basket {
	Map <String,Double>items = new HashMap<>();
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
	
	//items.put("1111", .60);
}
