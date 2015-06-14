package nl.kristalsoftware.kristalcms.resources;

import nl.kristalsoftware.kristalcms.resourcedata.CustomerData;

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.ws.rs.core.UriInfo;

/**
 * Created by sjoerdadema on 11-06-15.
 */
public class CustomerResourceImpl implements CustomerResource {

//    @Inject
//    private Session session;

    @Override
    public CustomerData getCustomer(String customerId, UriInfo uriInfo)  {
        System.out.println(uriInfo.getPath());
//        String path = uriInfo.getPath();
//        try {
//            Node node = session.getNode(path);
//        } catch (RepositoryException e) {
//            e.printStackTrace();
//        }
        CustomerData customerData = new CustomerData();
        customerData.setNodename("prima");
        return customerData;
    }
}
