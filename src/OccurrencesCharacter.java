import java.util.HashMap;
import java.util.Iterator;

public class OccurrencesCharacter {
    public static void main(String args[]) {
        hash("Matheesh is Matheesh who is who and there is no no no on hello");
    }


    public static void hash(String str) {

        String[] s = str.split("");

        HashMap<String, Integer> map = new HashMap<>();

        for (String item : s) {
            if (map.get(item) != null) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        map.remove(" ");
        Iterator<String> temp = map.keySet().iterator();

        while (temp.hasNext()) {
            String t = temp.next();
            if (map.get(t) >= 2) {
                System.out.println(t + "=" + map.get(t));
            }
        }

    }
}


//		String[] s = str.split(" ");
//
//		HashMap<String, Integer> hm = new HashMap<>();
//
//		for(String item : s) {
//			if(hm.get(item)!=null) {
//				hm.put(item, hm.get(item)+1);
//			}
//			else {
//				hm.put(item, 1);
//			}
//		}
//
//
//		Iterator<String> temp = hm.keySet().iterator();
//
//		while(temp.hasNext()) {
//			String tp = temp.next();
//			if(hm.get(tp)>1) {
//				System.out.println(tp + "--->" +hm.get(tp));
//			}
//		}






