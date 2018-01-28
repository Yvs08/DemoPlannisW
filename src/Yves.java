

public class Yves {
    
    public static void main(String[] args) {


    Test t = new Test("toto");

    Test t2 = new Test("Salut", t);

    try {

      Thread.sleep(1000);

    } catch (InterruptedException e) {

      e.printStackTrace();

    }

    System.out.println("statut du thread " + t.getName() + " = " + t.getState());

    System.out.println("statut du thread " + t2.getName() + " = " +t2.getState());   
    
    System.out.println(entiers(17));

  }
    
    public static boolean entiers (int n){
        boolean curse = true;
        if(n < 0 || n ==1){
            curse = false;  
        } else if (n!=0 && n!=1){
        for(int i=2;i<=n/2 ;i++){
            if(n!=i && n%i==0){
              curse = false;
              break ;
            }   
        }
        }
        return curse;
    }

  }


    

