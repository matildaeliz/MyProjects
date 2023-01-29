package MVC;



import java.io.IOException;


public class Main {

	public static void main(String[] args) throws Exception {
	
		View view = new View();
		Model model = new Model();
		
		Controller controller = new Controller(view, model);
    
	
		
	}
	
 
}
