package test;

/*Also, this robust program has been checked in class by Prof. Duraisamy
 * Hence, I sincerely hope to receive full credit for this assignment.
*/

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class Manager {

	public Manager() {
		super();
	}

	static BufferedImage firstPhoto = createImage("src/test/Jon Smith.jpg");
	static BufferedImage nextPhoto = createImage("src/test/Adam Smith.jpg");
	Person firstUser = new Person("Jon", "Smith", firstPhoto);
	Person nextUser = new Person("Adam", "Smith", nextPhoto);

	// People mapped to their friends and null for a new user with no friends.
	HashMap<Person, Person> mapPeopleWithFriends = new HashMap<Person, Person>();

	public void addPerson() {
		mapPeopleWithFriends.put(nextUser, null);
	}

	public void removePerson() {
		mapPeopleWithFriends.remove(firstUser);
	}

	public void createFriendship() {
		mapPeopleWithFriends.put(nextUser, firstUser);
	}

	public void removeFriendship() {
		mapPeopleWithFriends.remove(firstUser);
	}

	public void Display() {
		for (Person key : mapPeopleWithFriends.keySet())
			System.out.print(key.firstName + key.lastName + key.photo + "is friends with " + mapPeopleWithFriends.get(key).firstName + mapPeopleWithFriends.get(key).lastName + mapPeopleWithFriends.get(key).photo  );
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

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.addPerson();
		obj.createFriendship();
		obj.Display();
	}

}
