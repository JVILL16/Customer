package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.AppException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Customer;

public class CustomerGateway {

	private Connection conn;
	
	public CustomerGateway(Connection conn) {
		this.conn = conn;
	}
	public void updateCustomer(Customer customer) throws AppException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("update Customer set username = ?, password = ?, "
					+ "storeCredit = ?, name = ?, deliveryAddr = ?, phoneNr = ?, "
					+ "email = ? where id = ?");
			st.setString(1, customer.getUsername());
			st.setString(2, customer.getPassword());
			st.setInt(3, customer.getStoreCredit());
			st.setString(5, customer.getName());
			st.setString(6, customer.getDeliveryAddr());
			st.setString(7, customer.getPhoneNr());
			st.setString(8, customer.getEmail());
			st.setInt(9, customer.getAccountNm());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AppException(e);
		} finally {
			try {
				if(st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new AppException(e);
			}
		}
	}
	public void insertCustomer(Customer customer) throws AppException {
		PreparedStatement st = null;
		try {
			String sql = "insert into Customer "
					+ " (username, password, name, deliveryAddr, phoneNr, email) "
					+ " values (?, ?, ?, ?, ?, ?) ";
			st = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			st.setString(1, customer.getUsername());
			st.setString(2, customer.getPassword());
			//st.setInt(3, customer.getStoreCredit());
			st.setString(3, customer.getName());
			st.setString(4, customer.getDeliveryAddr());
			st.setString(5, customer.getPhoneNr());
			st.setString(6, customer.getEmail());
			st.executeUpdate();
			ResultSet rs = st.getGeneratedKeys();
			rs.first();
			customer.setAccountNm(rs.getInt(1));
			
			rs.close();

		} catch (SQLException e) {
			throw new AppException(e);
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public List<Customer> getCustomers() throws AppException {
		List<Customer> customers = new ArrayList<>();

		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("select * from Customer order by username");

			ResultSet rs = st.executeQuery();
			while(rs.next()) {

				Customer customer = new Customer();
				customer.setUsername(rs.getString("username"));
				customer.setPassword(rs.getString("password"));
				customer.setDeliveryAddr(rs.getString("deliveryAddr"));
				customer.setEmail(rs.getString("email"));
				customer.setPhoneNr(rs.getString("phoneNr"));
				customer.setName(rs.getString("name"));
				customer.setStoreCredit(rs.getInt("storeCredit"));
				customer.setGateway(this);
				customer.setAccountNm(rs.getInt("accountNr"));
				customers.add(customer);
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
			throw new AppException(e);
		} finally {
			try {
				if(st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new AppException(e);
			}
		}
		return customers;
	}
	
}
