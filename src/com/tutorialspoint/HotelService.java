package com.tutorialspoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONException;
import org.json.JSONObject;

import com.sun.media.jfxmedia.Media;

import jdk.nashorn.api.scripting.JSObject;

import java.io.IOException;
import java.sql.*;

@Path("/HotelService")

public class HotelService {

	final public static String db = "hotel_management_db";
	final public static String userName = "dinesh";
	final public static String password = "1234";

	// this API is for listing information about all hotels in database
	// url: http://localhost:8080/Hotel_Management/rest/HotelService/hotels/
	@GET
	@Path("/hotels")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getHotels() throws SQLException {
		Connection con = SqlBl.getconnection(db, userName, password);
		if (con != null) {
			// return SqlBl.getAllHotels(con);
			return Response.ok(SqlBl.getAllHotels(con)).header("Access-Control-Allow-Origin", "*").build();
		} else {
			return Response.status(400).build();
		}
	}

	// this API will filter hotels according name
	// url:http://localhost:8080/Hotel_Management/rest/HotelService/filter/hotels/name
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/filter/hotels/name")
	@Produces(MediaType.APPLICATION_JSON)
	public Response filterHotelsByName(Hotel h) throws SQLException {
		Connection con = SqlBl.getconnection(db, userName, password);
		if (con != null) {
			String name = h.getName();
			return Response.ok(SqlBl.getHotelsByName(con, name)).header("Access-Control-Allow-Origin", "*").build();
		} else {
			return Response.status(400).build();
		}
	}

	// this API will filter hotels according to city or name
	// url:
	// http://localhost:8080/Hotel_Management/rest/HotelService/filter/hotels/search
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/filter/hotels/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response filterHotelsByCity(Hotel h) throws SQLException {
		Connection con = SqlBl.getconnection(db, userName, password);
		if (con != null) {
			String cityName = h.getCity();
			return Response.ok(SqlBl.getHotelsByCity(con, cityName)).header("Access-Control-Allow-Origin", "*").build();
		} else {
			return Response.status(400).build();
		}
	}

	// this API is for listing information by id
	// url: http://localhost:8080/Hotel_Management/rest/HotelService/hotels/id
	@GET
	@Path("/hotels/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getHotelById(@PathParam("id") String id) throws SQLException {
		Connection con = SqlBl.getconnection(db, userName, password);
		if (con != null) {
			// return SqlBl.getAllHotels(con);
			return Response.ok(SqlBl.getHotelById(con, id)).header("Access-Control-Allow-Origin", "*").build();
		} else {
			return Response.status(400).build();
		}
	}

	// this api will create a booking

	@POST
	@Path("/booking/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createBooking(Booking b) throws IOException, JSONException, SQLException {

		Connection con = SqlBl.getconnection(db, userName, password);
		if (con != null) {
			HashMap<String, String> map;
			if (SqlBl.createBooking(con, b) == 1) {
				map = new HashMap<String, String>();
				map.put("status", "done");
				map.put("created", "1");
				return Response.ok(map).header("Access-Control-Allow-Origin", "*").build();
			} else {
				map = new HashMap<String, String>();
				map.put("status", "error");
				map.put("created", "0");
				return Response.ok(map).status(400).build();
			}
		} else {
			return Response.status(400).build();
		}

	}

}
