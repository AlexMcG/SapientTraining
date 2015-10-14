package com.sapient.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/date")
public class DataService {
	@GET
	@Path("/fetch")
	@Produces(MediaType.TEXT_HTML)
	public String retrieveDate(@QueryParam("year") int year,
	@QueryParam("month") int month, @QueryParam("day") int day) {
		return "<b>" + day +":" + month +":" + year + "</b>";
	}

	@GET
	@Path("/query/{year}/{month}/{day}")
	@Produces(MediaType.TEXT_HTML)
	public String queryDate(@PathParam("year") int year,
			@PathParam("month") int month, @PathParam("day") int day) {
		return "<b>" + day +":" + month +":" + year + "</b>";
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_HTML)
	public String setDate(@FormParam("year") int year,
			@FormParam("month") int month, @FormParam("day") int day) {
		return "<b>" + day +":" + month +":" + year + "</b>";
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.TEXT_HTML)
	public String putDate(@FormParam("year") int year, @FormParam("month") int month, @FormParam("day") int day) {
		return year + ":" + month + ":" + day + " Updated";
	}
	
}
	