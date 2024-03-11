import java.util.* ;



class CALC{
 double n1;
 double n2;
 void add(double n1,double n2){
  this.n1=n1;
  this.n2=n2;
  System.out.println(n1 + " + " + n2 + " = " + (n1+n2)+"\n");
 }
 void sub(double n1,double n2){
  this.n1=n1;
  this.n2=n2;
  System.out.println(n1 + " - " + n2 + " = " + (n1-n2)+"\n");
 }
 void mult(double n1,double n2){
  this.n1=n1;
  this.n2=n2;
   System.out.println(n1 +" * " + n2+" = " + (n1*n2)+"\n");
 }
 void div(double n1,double n2){
  this.n1=n1;
  this.n2=n2;
  if (n2 != 0){
   System.out.println(n1 + " / " + n2+ " = " + (n1/n2)+"\n");
  }else{
   System.out.println("DIVIDE BY ZERO NOT POSSIBLE\n");
   
 }
}
}



class CALCULATOR{
 public static void main(String args[]){
  double n1, n2;
  boolean b = true;
  char ch;
  Scanner sc = new Scanner(System.in);
  CALC a = new CALC();
  System.out.println(" ");
  System.out.println("WELCOME TO SIMPLE CALCULATOR CONSOLE: ");
  System.out.println("____________________________________\n ");
  while (b == true){
  System.out.println(" ");
  System.out.println("OPTIONS AVAILABLE - \n + --> addition\n - --> subtraction\n * --> multiplication \n / --> division \n q --> exit:\n ");
  System.out.println("Your Option:");
   ch = sc.next().charAt(0);
   if ( ch != 'q'){
   
   
   System.out.println("Enter 1st number:\n ");
   n1 = sc.nextDouble();
   System.out.println("Enter 2nd number:\n ");
   n2 = sc.nextDouble();
   System.out.println("RESULT:\n");
   
    
      if (ch =='+'){
       a.add(n1,n2);
       }
      else if (ch == '-'){
       a.sub(n1,n2);
      }else if (ch == '*'){
       a.mult(n1,n2);
      }else if (ch == '/'){
       a.div(n1,n2);
      }else{
       System.out.println("Try again\n");
       
      }
      }
    else{
    b = false;
      }
   }
 }
 
}
 
