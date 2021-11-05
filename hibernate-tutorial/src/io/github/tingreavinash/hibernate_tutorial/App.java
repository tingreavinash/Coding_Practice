package io.github.tingreavinash.hibernate_tutorial;

import io.github.tingreavinash.hibernate_tutorial.entity.Student;
import io.github.tingreavinash.hibernate_tutorial.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

/**
 * @author avinasht
 *
 */
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of records to add : ");
		int totalRecords = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < totalRecords; i++) {
			int count = i + 1;
			System.out.println("\nRecord no. " + count);
			System.out.println("Enter firstname: ");
			String firstname = sc.nextLine();

			System.out.println("Enter lastname: ");
			String lastname = sc.nextLine();

			System.out.println("Enter email: ");
			String email = sc.nextLine();

			Student s = new Student();
			s.setEmail(email);
			s.setFirstName(firstname);
			s.setLastName(lastname);

			saveStudent(s);

		}

		getAllStudents();

	}

	public static void getAllStudents() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List<Student> students = session.createQuery("from Student", Student.class).list();

			System.out.println("--> Total students in database: " + students.size());
			students.forEach(s -> System.out.println("ID: " + s.getId() + ",\tName: " + s.getFirstName()
					+ ",\tLastname: " + s.getLastName() + ",\tEmail: " + s.getEmail()));

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	/**
	 * <h1>Hibernate Method</h1>
	 * <h2>This method will save the given student entity in database.</h2>
	 *
	 * @param s Object of Student class
	 */
	public static void saveStudent(Student s) {
		Transaction tx = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.save(s);
			tx.commit();
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
		System.out.println("--> Added new student record !");
	}

}
