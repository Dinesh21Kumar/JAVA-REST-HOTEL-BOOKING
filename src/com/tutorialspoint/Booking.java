package com.tutorialspoint;

import java.util.Date;

public class Booking {
	private String hotel_id;
	private String hotel_name;
	private String check_in_date;
	private String check_out_date;
	private int no_of_guest;
	private int no_of_rooms;
	private String user_name;
	private String booking_date;
	private String booking_status;

	/**
	 * @param hotel_id
	 * @param hotel_name
	 * @param check_in_date
	 * @param check_out_date
	 * @param no_of_guest
	 * @param no_of_rooms
	 * @param user_name
	 * @param booking_date
	 * @param booking_status
	 */
	public Booking() {
	}

	public Booking(String hotel_id, String hotel_name, String check_in_date, String check_out_date, int no_of_guest,
			int no_of_rooms, String user_name, String booking_date, String booking_status) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.no_of_guest = no_of_guest;
		this.no_of_rooms = no_of_rooms;
		this.user_name = user_name;
		this.booking_date = booking_date;
		this.booking_status = booking_status;
	}

	public String getHotel_id() {
		return hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public String getCheck_in_date() {
		return check_in_date;
	}

	public String getCheck_out_date() {
		return check_out_date;
	}

	public int getNo_of_guest() {
		return no_of_guest;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getBooking_date() {
		return booking_date;
	}

	public String getBooking_status() {
		return booking_status;
	}

	public void setHotel_id(String hotel_id) {
		this.hotel_id = hotel_id;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public void setCheck_in_date(String check_in_date) {
		this.check_in_date = check_in_date;
	}

	public void setCheck_out_date(String check_out_date) {
		this.check_out_date = check_out_date;
	}

	public void setNo_of_guest(int no_of_guest) {
		this.no_of_guest = no_of_guest;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}

	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

}
