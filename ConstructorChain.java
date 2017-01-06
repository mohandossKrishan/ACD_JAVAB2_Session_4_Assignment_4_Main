public class ConstructorChain {
   public ConstructorChain(){
         System.out.println("Constructor without Parameter");
   }
   public ConstructorChain(String str){
         this();
    	 System.out.println("Constructor with one parameter");
   }
   public ConstructorChain(String str, int num){
       	 this("Hello"); 
    	 System.out.println("Constructor with two parameter");
   }
   public ConstructorChain(int num1, int num2, int num3){
        this("Hello", 2);
        System.out.println("Constructor with three parameter");
   }
   public static void main(String args[]){
        ConstructorChain obj = new ConstructorChain(5,5,15);
   }
}