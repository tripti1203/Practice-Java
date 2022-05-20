// Driver class 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 { 
		        two g = new two(); 
		        g.print_geek(); 
		        g.print_for(); 
		        g.print_geek(); 
		    } 
	}
}

//Inheritance------------------------------------------------------------------
//BASE CLASS
class one 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
 //DERIVED CLASS
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
