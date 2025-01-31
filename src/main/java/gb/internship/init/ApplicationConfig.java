package gb.internship.init;

import gb.internship.controller.ClientController;
import gb.internship.controller.DemoController;
import gb.internship.controller.DoctorController;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath ("/api")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(DemoController.class);
        register(ClientController.class);
        register(DoctorController.class);
        register(new MyApplicationBinder());
    }

}
