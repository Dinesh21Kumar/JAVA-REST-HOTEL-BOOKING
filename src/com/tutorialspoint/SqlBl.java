package com.tutorialspoint;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SqlBl {

	// connect to database
	public static Connection getconnection(String db, String userName, String password) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, userName, password);
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}

	public static List<Hotel> getAllHotels(Connection con) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from hotels ORDER BY reviews_rating DESC");
		Hotel obj;
		List<Hotel> list = new ArrayList<Hotel>();
		while (rs.next()) {
			obj = new Hotel();
			obj.setId(rs.getString(1));
			obj.setAddress(rs.getString(2));
			obj.setCategories(rs.getString(3));
			obj.setCity(rs.getString(4));
			obj.setCountry(rs.getString(5));
			obj.setLatitude(rs.getDouble(6));
			obj.setLongitude(rs.getDouble(7));
			obj.setName(rs.getString(8));
			obj.setPostalCode(rs.getInt(9));
			obj.setProvince(rs.getString(10));
			obj.setReviews_rating(rs.getInt(11));
			obj.setReviews_text(rs.getString(12));
			obj.setReviews_title(rs.getString(13));
			obj.setReviews_username(rs.getString(14));
			obj.setAvailabilty(rs.getInt(15));
			list.add(obj);
		}
		con.close();
		return list;
	}

	public static List<Hotel> getHotelsByName(Connection con, String name) throws SQLException {
		Statement stmt = con.createStatement();
		String query = "select * from hotels where name = ?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		Hotel obj;
		List<Hotel> list = new ArrayList<Hotel>();
		while (rs.next()) {
			obj = new Hotel();
			obj.setId(rs.getString(1));
			obj.setAddress(rs.getString(2));
			obj.setCategories(rs.getString(3));
			obj.setCity(rs.getString(4));
			obj.setCountry(rs.getString(5));
			obj.setLatitude(rs.getDouble(6));
			obj.setLongitude(rs.getDouble(7));
			obj.setName(rs.getString(8));
			obj.setPostalCode(rs.getInt(9));
			obj.setProvince(rs.getString(10));
			obj.setReviews_rating(rs.getInt(11));
			obj.setReviews_text(rs.getString(12));
			obj.setReviews_title(rs.getString(13));
			obj.setReviews_username(rs.getString(14));
			obj.setAvailabilty(rs.getInt(15));
			list.add(obj);
		}
		con.close();
		return list;
	}

	public static List<Hotel> getHotelsByCity(Connection con, String city) throws SQLException {
		Statement stmt = con.createStatement();
		String query = "select * from hotels where city like ? or name like ?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, "%" + city + "%");
		pstmt.setString(2, "%" + city + "%");
		ResultSet rs = pstmt.executeQuery();
		Hotel obj;
		List<Hotel> list = new ArrayList<Hotel>();
		while (rs.next()) {
			obj = new Hotel();
			obj.setId(rs.getString(1));
			obj.setAddress(rs.getString(2));
			obj.setCategories(rs.getString(3));
			obj.setCity(rs.getString(4));
			obj.setCountry(rs.getString(5));
			obj.setLatitude(rs.getDouble(6));
			obj.setLongitude(rs.getDouble(7));
			obj.setName(rs.getString(8));
			obj.setPostalCode(rs.getInt(9));
			obj.setProvince(rs.getString(10));
			obj.setReviews_rating(rs.getInt(11));
			obj.setReviews_text(rs.getString(12));
			obj.setReviews_title(rs.getString(13));
			obj.setReviews_username(rs.getString(14));
			obj.setAvailabilty(rs.getInt(15));
			list.add(obj);
		}
		con.close();
		return list;
	}

	public static List<Hotel> getHotelById(Connection con, String id) throws SQLException {
		Statement stmt = con.createStatement();
		String query = "select * from hotels where id = ?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		Hotel obj;
		List<Hotel> list = new ArrayList<Hotel>();
		while (rs.next()) {
			obj = new Hotel();
			obj.setId(rs.getString(1));
			obj.setAddress(rs.getString(2));
			obj.setCategories(rs.getString(3));
			obj.setCity(rs.getString(4));
			obj.setCountry(rs.getString(5));
			obj.setLatitude(rs.getDouble(6));
			obj.setLongitude(rs.getDouble(7));
			obj.setName(rs.getString(8));
			obj.setPostalCode(rs.getInt(9));
			obj.setProvince(rs.getString(10));
			obj.setReviews_rating(rs.getInt(11));
			obj.setReviews_text(rs.getString(12));
			obj.setReviews_title(rs.getString(13));
			obj.setReviews_username(rs.getString(14));
			obj.setAvailabilty(rs.getInt(15));
			list.add(obj);
		}
		con.close();
		return list;
	}

	public static int createBooking(Connection con, Booking b) throws SQLException {
		String query = " insert into booking_table (hotel_id, hotel_name, check_in_date, check_out_date, "
				+ "no_of_guest,no_of_rooms,user_name,booking_date,booking_status)"
				+ " values (?, ?, ?, ?, ?,?, ?, ?, ?)";
		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, b.getHotel_id());
		preparedStmt.setString(2, b.getHotel_name());
		preparedStmt.setString(3, b.getCheck_in_date());
		preparedStmt.setString(4, b.getCheck_out_date());
		preparedStmt.setInt(5, b.getNo_of_guest());
		preparedStmt.setInt(6, b.getNo_of_rooms());
		preparedStmt.setString(7, b.getUser_name());
		preparedStmt.setString(8, b.getBooking_date());
		preparedStmt.setString(9, b.getBooking_status());
		int r = preparedStmt.executeUpdate();
		return r;
	}

}
