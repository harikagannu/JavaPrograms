package JavaPrograms;

public class RemoveJunkandSpecialcharecters {

	public static void main(String[] args) {
    String s="!@#$%^^& string Java";
    s=s.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(s);

		
		
	}
}
