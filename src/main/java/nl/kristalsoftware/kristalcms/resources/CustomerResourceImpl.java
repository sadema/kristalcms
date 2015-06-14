package nl.kristalsoftware.kristalcms.resources;

import nl.kristalsoftware.kristalcms.resourcedata.CustomerData;

/**
 * Created by sjoerdadema on 11-06-15.
 */
public class CustomerResourceImpl implements CustomerResource {

    @Override
    public CustomerData getCustomer(String customerId)  {
        CustomerData customerData = new CustomerData();
        customerData.setNodename("prima");
        return customerData;
    }
}
