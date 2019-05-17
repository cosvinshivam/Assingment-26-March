public class SquareUsingMap {
 
  static java.util.HashMap getSquares(int[] ar) {
    
   java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();

     for (int n: ar) {
      map.put( n, n*n);
    }
    return map;
  }
 
  public static void main(String[] args) {
    int array[] = new int[]{1,2,3,4,5};
    java.util.HashMap<Integer, Integer> map = getSquares(array);
     java.util.Iterator<Integer> it = map.keySet().iterator();
    while(it.hasNext()){
    Integer key = it.next();
      System.out.println(key + " : " + map.get(key));
    }
  }
}
 