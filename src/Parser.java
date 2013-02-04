import java.util.Scanner;


public class Parser {
	private Scanner reader;
	
	public Parser() 
    {
        reader = new Scanner(System.in);
    }
	
	public int requestSide() 
    {
        String command = null;
        do {
            System.out.print("> "); 
            command = readLine();
            
        } while(command == null);

        return Integer.parseInt(command);
    }
	
	public String requestColor() 
    {
        String command = null;
        do {
            System.out.print("> "); 
            command = readLine();
            
        } while(command == null);

        return command;
    }
	
	public boolean requestBoolean() 
    {
        String command = null;
        do {
            System.out.print("> "); 
            command = readLine();
            
        } while(command == null);
        if(command.equals("true")) {
        	return true;
        }
        else if(command.equals("false")) {
        	return false;
        }        	
        return false;
    }
	
	public String readLine()
    {
        return reader.nextLine();
    }
}
