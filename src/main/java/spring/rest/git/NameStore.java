package spring.rest.git;

import java.util.List;

public class NameStore {
	private static List<Name> allNames;
	static {
		Name n1 = new Name("James","Gosling");
		Name n2 = new Name("Gavin","King");
		Name n3 = new Name("Rod","Johnson");
		Name n4 = new Name("Linus","Torvalds");
		Name n5 = new Name("Ryan","Dahl");
		allNames = List.of(n1,n2,n3,n4,n5);
	}
	public static List<Name> getAllNames(){
		return allNames;
	}
}
record Name(String firstName, String lastName) {}
