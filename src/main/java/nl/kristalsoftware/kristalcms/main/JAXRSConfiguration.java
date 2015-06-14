package nl.kristalsoftware.kristalcms.main;

import nl.kristalsoftware.kristalcms.cms.CmsContentHandler;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.logging.Logger;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

//    @Inject
//    private Logger log;
//
//    @Inject
//    private BaseRepository repo;
//
//    @Inject
//    private CmsContentHandler contentHandler;

    public JAXRSConfiguration() {
        System.out.println("JAXRSConfiguration constructor");
    }

//    @PostConstruct
//    public void init() {
//        log.info("init method");
//        repo.checkForContent("/cms", contentHandler);
//    }
}
