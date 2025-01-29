import java.util.Scanner;

public class Query{
    public static void main(String [] args){
        Engine x = null;
        
        
        if(args.length == 0){
            System.out.println("options:waldo");
            return;
        }
        
        String input = args[0].toLowerCase();
        if(input.equals("waldo")){
            x = Engine.valueOf(input);
            
        }
        
        AI bot = new AI(x);
        System.out.println("Selected AI: "+ x);
        Scanner say = new Scanner(System.in);
        
        while(say.hasNextLine()){
            String user = say.nextLine();
            String response = bot.query(user);
            System.out.println("response saved");
            
        }
        System.out.println("History");
        for(String query : bot.getQueryHistory()){
            if(query != null){
                System.out.println(query);
                
            }
            
        }
        
        say.close();
        
    }
    
    
}
