
public class Java8 extends  Yves {
  


    public static void main(String args[]) {
//        {
//    String[] tab = {"yves", "etienne", "serges", "tete"};
//    parcourirTableau(tab);
//    System.out.println(toString(tab));   
//  }
    
        Java8 jd = new Java8(); 
        int iBase = 0;
        jd.amethod(iBase);
      
    }
   public void amethod(int iover){
       System.out.println("over.amethod");
   }

}

//  static void parcourirTableau(String[] tab)
//  {
//    for(String str : tab)
//    System.out.println(str);
//  }
//           
//  static String toString(String[] tab)
//  {
//    System.out.println("Méthode toString() !\n----------");
//    String retour = "";
//                   
//    for(String str : tab)
//      retour += str + "\n"; 
//                   
//    return retour;
//  }         
//}
/**
 * Java8 tester = new Java8();
 *
 * //with type declaration MathOperation addition = (int a, int b) -> a + b;
 *
 * //with out type declaration MathOperation subtraction = (a, b) -> a - b;
 *
 * //with return statement along with curly braces MathOperation multiplication
 * = (int a, int b) -> { return a * b; };
 *
 * //without return statement and without curly braces MathOperation division =
 * (int a, int b) -> a / b;
 *
 * System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
 * System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
 * System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
 * System.out.println("10 / 5 = " + tester.operate(10, 5, division));
 *
 * //with parenthesis GreetingService greetService1 = message ->
 * System.out.println("Hello " + message);
 *
 * //without parenthesis GreetingService greetService2 = (message) ->
 * System.out.println("Hello " + message);
 *
 * greetService1.sayMessage("Mahesh"); greetService2.sayMessage("Suresh"); }
 *
 * interface MathOperation {
 *
 * int operation(int a, int b); }
 *
 * interface GreetingService {
 *
 * void sayMessage(String message); }
 *
 * private int operate(int a, int b, MathOperation mathOperation) { return
 * mathOperation.operation(a, b); } }
 *
 */
