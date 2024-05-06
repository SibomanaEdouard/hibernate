package org.example;

import org.example.Entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Create a new employee
            Employee employee = new Employee();
            employee.setId(1);
            employee.setFirstname("Edouard");
            employee.setLastname("SIBOMANA");
            employee.setEmail("test@gmail.com");

            // Save the employee
            session.save(employee);

            transaction.commit();
            System.out.println("The user saved successfully");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.out.println("Failed to save user");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
