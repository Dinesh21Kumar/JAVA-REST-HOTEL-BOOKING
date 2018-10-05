package com.tutorialspoint;

public class Hotel {
	private String id;
	private String address;
	private String categories;
	private String city;
	private String country;
	private Double latitude;
	private Double longitude;
	private String name;
	private int postalCode;
	private String province;
	private int reviews_rating;
	private String reviews_text;
	private String reviews_title;
	private String reviews_username;
	private int availabilty;
	
	
	public Hotel(String id, String address, String categories, String city, String country, Double latitude,
			Double longitude, String name, int postalCode, String province, int reviews_rating, String reviews_text,
			String reviews_title, String reviews_username,int availabilty) {
		super();
		this.id = id;
		this.address = address;
		this.categories = categories;
		this.city = city;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.postalCode = postalCode;
		this.province = province;
		this.reviews_rating = reviews_rating;
		this.reviews_text = reviews_text;
		this.reviews_title = reviews_title;
		this.reviews_username = reviews_username;
		this.availabilty = availabilty;
	}
	public String getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public String getCategories() {
		return categories;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public Double getLatitude() {
		return latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public String getName() {
		return name;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public String getProvince() {
		return province;
	}
	public int getReviews_rating() {
		return reviews_rating;
	}
	public String getReviews_text() {
		return reviews_text;
	}
	public String getReviews_title() {
		return reviews_title;
	}
	public String getReviews_username() {
		return reviews_username;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 
	 */
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param city
	 * @param name
	 */
	public Hotel(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setReviews_rating(int reviews_rating) {
		this.reviews_rating = reviews_rating;
	}
	public void setReviews_text(String reviews_text) {
		this.reviews_text = reviews_text;
	}
	public void setReviews_title(String reviews_title) {
		this.reviews_title = reviews_title;
	}
	public void setReviews_username(String reviews_username) {
		this.reviews_username = reviews_username;
	}
	public int getAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(int availabilty) {
		this.availabilty = availabilty;
	}

}
