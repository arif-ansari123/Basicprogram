import java.util.Scanner;

public class Basicprogram {
    //How to Read and Print an Integer value in Java
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("the integer number is :  "+n);
    //-------------------------------------------------------------------    
     //Ways to read input from console in Java
        //Using Scanner Class
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("the integer number is :  "+n);
    //-------------------------------------------------------------------    
     //Java Program to Multiply two Floating-Point Numbers
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        float c=a*b;
        System.out.println("the multiplication of two number is : "+c);
    //-------------------------------------------------------------------    
    //Java Program to Swap Two Numbers
        int a=6;
        int b=4;
        Scanner sc= new Scanner(System.in);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after swapping"+a+" "+b);
    //-------------------------------------------------------------------    
    //  Java Program to Add Two Binary Strings 
        String a = "110";
        String b = "011";
        //Integer is wrapper class and parseInt is static class
        int m = Integer.parseInt(a,2);
        //convert string to int
        int n = Integer.parseInt(b,2);
        int sum = m+n;
        //converting integer value  to string
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    //-------------------------------------------------------------------    
    // Java Program to Add two Complex Numbers:
    int real,img;
    public ComplexNumber(int r,int i){
        this.real=r;
        this.img=i;
    }
    public void show(){
        System.out.println(this.real +"i"+this.img);
    }
    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res=new ComplexNumber(0,0);
        res.real=n1.real+n2.real;
        res.img=n1.img+n2.img;
        return res;
    }
    public static void main(String[] args){
        ComplexNumber c1=new ComplexNumber(4,5);
        ComplexNumber c2=new ComplexNumber(10,5);
        System.out.println("the first complex number");
        c1.show();
        System.out.println("the second complex number");
        c2.show();
        ComplexNumber res=add(c1,c2);
        System.out.println("the addition of two complex number is : ");
        res.show();
    //-------------------------------------------------------------------    
    //  Java Program to Check Even or Odd Integers
      int n;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      if(n%2==0){
          System.out.println("even");
      }
      else{
          System.out.println("odd");
      }
    //-------------------------------------------------------------------  
      //Java Program to Find Largest Among 3 Numbers
      int a= 2;
      int b= 3;
      int c= 4;
      if(a>b){
          System.out.println("a is greater");
      }
      else if(b>c)
      {
          System.out.println("b is greater");
      }
      else
      {
          System.out.println("c is greater");
      }
    //-------------------------------------------------------------------  
      //Java Program to Find LCM of Two Numbers
      int number1;
      int number2;
      Scanner sc = new Scanner(System.in);
      number1=sc.nextInt();
      number2=sc.nextInt();
      int lcm = (number1>number2) ? number1:number2;
      while(true){
          if(lcm%number1==0 && lcm%number2==0){
              System.out.println("the lcm of "+number1+"and"+number2 + "is :"+lcm );
          }
          else{
                lcm++;
             
          }
      }
     //------------------------------------------------------------------- 
      //Java Program to Find gcd of Two Numbers
      int a;
      int b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a first number");
      a=sc.nextInt();
      System.out.println("Enter a second number");
      b=sc.nextInt();
      int g=0;
      for(int i=1;i<=a;i++){
          if(a%i==0 && b%i==0){
              g=i;
          }
      }
      System.out.println(g);
    //------------------------------------------------------------------- 
    //Java Program to Display All Prime Numbers from 1 to N
   class PrimeNumberList
{
    public static void main(String args[])
    {
        int temp=0;
        for(int no=1;no<=100;no++)
        {
            for(int i=2;i<=no-1;i++)
            {
                if(no%i==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0)
            {
                System.out.println(no);
            }
            else
            {
                temp=0;
            }
        }
    }
}
    //Java Program to Check Leap Year
    int n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    if(n%100==0 || n%400==0 || n%4==0 )
    {
        System.out.println("its a leap year"+n);
    }
    else
    {
        System.out.println("its not a leap year"+n);
    }
    //----------------------------------------------------------------------
    //Java Program to Check Armstrong Number between Two Integers
    int n;
    int q = n;
    int pow=0;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    while(n!=0)
    {
        int d = n%10;
        pow+=Math.pow(d,3);
        n=n/10;
    }
    if(pow==q)
    {
        System.out.println(q+ "its a armstrong number");
    }
    else
    {
        System.out.println(q+ "its not a armstrong number");
    }
    //Java Program to Check Whether the Character is Vowel or Consonant
    char c;
    Scanner sc = new Scanner(System.in);
    c=sc.next().charAt(0);
    if(c=='A'||c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    {
        System.out.println("its is vowel");
    }
    else
    {
       System.out.println("its is consonant"); 
    }
    //----------------------------------------------------------------------
    //Java Program to Find Factorial of a number
    int n,fact=1;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println(fact);
    //-----------------------------------------------------------------------
    //Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
    int a=0;
    int b=1;
    int c;
    int n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    for(int i=2;i<=2*n;i++)
    {
        c=a+b;
        c=b;
        b=a;
    }
    System.out.println(c);
    
      }
     }
