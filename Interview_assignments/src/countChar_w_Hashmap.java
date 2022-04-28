import java.util.HashMap;

public class countChar_w_Hashmap {

	public static void main(String[] args) {

		String str = "programming";
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count++);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
