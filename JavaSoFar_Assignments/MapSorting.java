import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
class MapSorting{

   void getValues(HashMap map)
   {

     List list=new ArrayList<>();
     Set <String>set = map.entrySet();
    for(Object me : set) {
	 Map.Entry m = (Map.Entry) me;
       list.add(m.getValue());
       Collections.sort(list);
       
    }
    for (Object o : list) {
       	System.out.println(o);
       }

   }
	public static void main(String[] args) {
        MapSorting ms=new MapSorting();
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
         hmap.put(5, "A");
         hmap.put(11, "C");
         hmap.put(4, "Z");
         hmap.put(77, "Y");
         hmap.put(9, "P");
         hmap.put(66, "Q");
         hmap.put(0, "R");
      ms.getValues(hmap);
         }
    }
