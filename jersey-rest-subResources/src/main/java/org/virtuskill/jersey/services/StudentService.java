package org.virtuskill.jersey.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.virtuskill.jersey.domain.Student;
import org.virtuskill.jersey.repository.StudentDAO;

@Path("/student")
public class StudentService {

	StudentDAO studentDAO = new StudentDAO();

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	// access this element in path - jerseyWebApp/student/102/
	public Student getStudent(@PathParam(value = "id") long id) {
		return studentDAO.getStudent(id);
	}

	@Path("/{id}/address")
	// Sub Resource, calling another class for servicing in pathParam
	public AddressService getAddressService() {
		return new AddressService();
	}

}
