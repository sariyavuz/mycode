import java.util.HashMap;

public class GMap {

	public static void main(String[] args) {
//		Map has (key and value pair.
		
		HashMap<Integer,String> hsmp = new HashMap<Integer,String>();
		
		hsmp.put(1, "name");
		hsmp.put(2, "age");
		
		System.out.println(hsmp);
		System.out.println(hsmp.get(2));
		System.out.println(hsmp.get(1));

	}

}
