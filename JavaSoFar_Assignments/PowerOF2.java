 class PowerOF2 {

 private static boolean checkNumber(int number){
     return (number > 0) && ((number & (number - 1)) == 0);
 }
    public static void main(String args[]) {
      PowerOF2 p=new PowerOF2();
      java.util.Scanner scanner = new java.util.Scanner(System.in);
       System.out.println("Enter a number : ");
       int num = scanner.nextInt();
              if(p.checkNumber(num)){
           System.out.println("It is in Power of 2.");
       }else{
           System.out.println("It is not in Power of 2.");
       }
    }
}

