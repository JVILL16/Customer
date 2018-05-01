package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Basket {
	HashMap items = new HashMap();
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
	
	
	public void addToBasket() {
	
		
		try {
			resultSet =  statement.executeQuery("select * from Produce" );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		while(resultSet.next() && i<6) {
			Produce produce = new Produce();
			i++;
			produce.Produce(resultSet.getInt("plu"),resultSet.getString("name"),resultSet.getString("description"),resultSet.getFloat("tax"),resultSet.getFloat("itemCost"),resultSet.getFloat("weightCost"),resultSet.getInt("count"),resultSet.getShort("weight"));
		}
		
		items.put(plu, value);
	}
}
