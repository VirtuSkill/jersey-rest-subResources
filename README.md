# jersey-rest-subResources
A simple Jersey REST Service API explains the concepts for sub resources

Download and import the project as existing Maven Project, and do a run on server (Tomcat)

This Project explains how to make use of the sub resources concept in rest
e.g - http://localhost:8080/jersey-rest-subResources/jerseyWebApp/student/{studentId}/address/{addressId}

Student and Address are different models and REST helps us to classifies them in an orderly fashion and 
gives an option to access a sub resources inside a parent resource service

@Path("/{id}/address")

// Sub Resource, calling another Resource Service for servicing in pathParam in the Parent service
  
	public AddressService getAddressService() {
  
		return new AddressService();
    
	}
