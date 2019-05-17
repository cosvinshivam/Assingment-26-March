
class CountCharacters
{
   static void characterCount(String st)
    {
         
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<Character, Integer>();
       
        char[] strArray = st.toCharArray();
  
        for (char c : strArray)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
               map.put(c,1);
            }
        }
 
        System.out.println(map);
    }
 
    public static void main(String[] args)
    {
        String  str="YES Done And Gone";
        // char[] st = str.toCharArray();
       characterCount(str);
 
    }
 
   
}
