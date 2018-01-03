package com.rallydev.mentorship.embeddedjetty;

import com.rallydev.mentorship.Relationship;
import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpStatus.OK_200);
        Relationship relationship = new Relationship();

        relationship.setActive(false);
        relationship.setArea("java");
        relationship.setPower_user(true);
        relationship.setMentor(true);

        resp.getWriter().println(relationship.getArea());
    }
}
