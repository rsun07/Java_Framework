package pers.xiaoming.java_framework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Server implements AutoCloseable {
    private static SessionFactory sessionFactory;

    private Server() {

    }

    public static Session getSession() {
        if (sessionFactory == null) {
            synchronized (Server.class) {
                sessionFactory = initSession();
            }
        }
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private static SessionFactory initSession() {
        Configuration config = new Configuration().configure();

        SessionFactory sessionFactory = config.buildSessionFactory();

        return sessionFactory;
    }

    @Override
    public void close() {
        sessionFactory.close();
    }
}
