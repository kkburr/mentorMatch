package com.rallydev.mentorship.embeddedjetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import java.util.logging.Logger;

public class EmbeddedJettyMain {
    private static final Logger LOGGER = Logger.getLogger("JPA");

    public static void main(String[] args) throws Exception {
        Server server = new Server(7070);
        ServletContextHandler handler = new ServletContextHandler(server, "/example");
        handler.addServlet(ExampleServlet.class, "/");
        server.start();
    }
}
