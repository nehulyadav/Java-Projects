package test;

/*Checked by Prof. Duraisamy in class. It works correctly!
 * @author Nehul Yadav
Assignment: Lab 6
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class Person {
	// HashMap that maps Person to his friends

	static HashMap<Person, Person> friendList = new HashMap<Person, Person>();
	static BufferedImage img1 = createImage("src/test/Yadav, Nehul.jpg");
	static BufferedImage img2 = createImage("src/test/Jackson Coulter.jpg");
	static Person user = new Person("Nehul", "Yadav", img1);
	static Person friend = new Person("Jackson", "Coulter", img2);

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, Image photo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.photo = photo;
	}

	public String firstName;
	public String lastName;
	public Image photo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Image getPortrait() {
		return photo;
	}

	public void setPortrait(Image photo) {
		this.photo = photo;
	}

	public static BufferedImage createImage(String x) {
		BufferedImage bufferedImage;
		try {

			bufferedImage = ImageIO.read(new File(x));

			return bufferedImage;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addFriend() {
		friendList.put(user, friend);
		System.out.println(user.firstName + user.lastName + user.photo + "is friends with " + friend.firstName + ""
				+ friend.lastName + friend.photo);
	}

	public void removeFriend(Person specificPerson) {
		friendList.remove(specificPerson);
		System.out.println(user.firstName + user.lastName + user.photo + "is not friends with " + friend.firstName + ""
				+ friend.lastName + friend.photo);
	}

	public void Display() {
		for (Person key : friendList.keySet())
			System.out.println(key.firstName + key.lastName + key.photo);

	}

	public static void main(String[] ar) {
		Person obj = new Person();
		obj.addFriend();
		obj.removeFriend(friend);
		obj.Display();

	}
}
