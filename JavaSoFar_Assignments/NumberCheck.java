class NumberCheck {


     boolean checkNumber(int num)
     {
       boolean flag = false;

       int currentDigit = num % 10;
       num = num/10;
       while(num>0){
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }
           currentDigit = num % 10;
           num = num/10;
       }
       return flag;
     }
    public static void main(String args[]) {
      NumberCheck nc=new NumberCheck();
      java.util.Scanner scanner = new java.util.Scanner(System.in);
       System.out.println("Enter a number : ");
       int num = scanner.nextInt();
              if(nc.checkNumber(num)){
           System.out.println("Digits are not in increasing order.");
       }else{
           System.out.println("Digits are in increasing order.");
       }
    }
}