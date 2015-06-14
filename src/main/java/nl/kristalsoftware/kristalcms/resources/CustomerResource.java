package nl.kristalsoftware.kristalcms.resources;

import nl.kristalsoftware.kristalcms.resourcedata.CustomerData;

import javax.ws.rs.*;

/**
 * Created by sjoerdadema on 11-06-15.
 */
@Path("/cms")
@Consumes("application/json,application/xml")
@Produces("application/json,application/xml")
public interface CustomerResource {

    @GET
    @Path("{customerId}")
    CustomerData getCustomer(@PathParam("customerId") String customerId);

}
