public class Query{
    public static void main(String [] args){
        Engine x = null;
        
        
        if(args.length == 0){
            System.out.println("options:waldo");
            return;
        }
        
        String input = args[0].toLowercase();
        if(input.equals("waldo")){
            x = Engine.valueof(input);
            
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
        for(String query : bot.getQuery()){
            if(query != null){
                System.out.prinln(query);
                
            }
            
        }
        
        Scanner.close();
        
    }
    
    
}
