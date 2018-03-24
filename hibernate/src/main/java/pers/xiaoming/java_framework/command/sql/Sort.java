package pers.xiaoming.java_framework.command.sql;

import org.hibernate.Session;
import pers.xiaoming.java_framework.command.GetTopTenStudents;
import pers.xiaoming.java_framework.entity.Student;

import java.util.List;

public class Sort implements GetTopTenStudents {
    private final static String SQL_QUERY = "SELECT t_id, t_name, t_age, t_score FROM t_student ORDER BY t_score DESC LIMIT 10;";

    @SuppressWarnings("unchecked")
    public List<Student> get(Session session) {
        try {
            session.beginTransaction();

            List<Student> list = session.createSQLQuery(SQL_QUERY)
                    .addEntity(Student.class).list();

            session.getTransaction().commit();
            return list;

        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }
}
