package Servlets;

import DAOS.DriverDAO;
import Entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DriverServlet extends HttpServlet {
    private final ObjectMapper objectMapper;
    private final DriverDAO driverDAO;
    private String logstring;

    public DriverServlet(ObjectMapper objectMapper, DriverDAO driverDAO) {
        this.objectMapper = objectMapper;
        this.driverDAO = driverDAO;
    }
    


        @Override
        public void init() throws ServletException {
            System.out.println("[LOG] - User Created.");
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = driverDAO.getAllUsers();
        String result = objectMapper.writeValueAsString(userList);
        resp.setContentType("application/json");
        resp.getWriter().write(result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = driverDAO.getAllUsers();
        String result = objectMapper.writeValueAsString(userList);
        resp.setContentType("application/json");
        resp.getWriter().write(result);
    }

        }
