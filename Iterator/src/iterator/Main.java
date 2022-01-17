package iterator;

public class Main {

    public static void main(String[] args) throws Exception {
        Login lg = new Login(5);
        
        lg.add("Alvaro",1);
        lg.add("Jose",1);
        lg.add("Juan",1);
        lg.add("Sergio",1);
        lg.add("Jorge",1);
        
        lg.add("Alvaro",2);
        lg.add("Jose",2);
        lg.add("Juan",2);
        lg.add("Sergio",2);
        lg.add("Jorge",2);
        
        lg.add("Alvaro",3);
        lg.add("Jose",3);
        lg.add("Juan",3);
        lg.add("Sergio",3);
        lg.add("Jorge",3);
        
        lg.imprime(2);
        //lg.imprime(-1);
    }
}