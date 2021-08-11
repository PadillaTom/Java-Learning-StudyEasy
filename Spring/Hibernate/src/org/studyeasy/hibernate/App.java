package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // *** Session ***
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Users.class)
                                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        // *** In Action ***
        try {
            // Create Object out of Entity Class
//            Users user = new Users("LaKaty","123","Katy","Torres");
//            Users user = new Users();

            // Start Transaction
            session.beginTransaction();

            // Perform Operation Hibernate
//                // --- CREATE ---
//            session.save(user);
//                // --- READ by ID ---
//            user = session.get(Users.class, 1);
//                // --- UPDATE by ID --- Instance, Get, Set
//            user.setUsername("NombreCambiado");
//                // -- DELETE by ID --- Instance, Get,
//            session.delete(user);

            // Operations with HQL:
                // --- FIND ALL --- Dar @Entity (name="users") a la Class
//            List<Users> myUsers = session.createQuery("from users").getResultList();
//            for (Users temp : myUsers){
//                System.out.println("User: " + temp);
//            }
                // --- FIND WHERE --- Not Case Sensitive, Accepts Column Name or Class Attribute Name
//            List<Users> myUsers = session.createQuery("from users where firstName = 'Katy' "
//                                                        + "OR user_id = '2' ").getResultList();
//            for (Users temp : myUsers){
//                System.out.println("User: " + temp);
//            }
                // --- UPDATE ---
//            session.createQuery("update users set password ='HolaGuacho' "
//                                    + "where firstName = 'Katy' ").executeUpdate();
                // --- DELETE ---
//            session.createQuery("delete from users where userId = '2' ").executeUpdate();





            // Commit the Transaction
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
