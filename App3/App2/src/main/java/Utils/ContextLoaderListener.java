package Utils;

import DAOS.DriverDAO;
import DAOS.DriverDAOPostgres;
import Servlets.DriverServlet;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import java.time.LocalDateTime;

public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextAttributeEvent sce) {
        System.out.println("[LOG] - Context Loader Listener initialized at -" + LocalDateTime.now());
        ObjectMapper mapper = new ObjectMapper();

    DriverDAO driverDAO = new DriverDAOPostgres();

    DriverServlet driverServlet = new DriverServlet(mapper, driverDAO);

    ServletContext context = sce.getServletContext();

ServletRegistration.Dynamic servletRegistration = context.addServlet("DriverServlet", driverServlet);

servletRegistration.addMapping("/drivers/*");



    }
}
