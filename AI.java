public class AI{
    private String engine;
    private String[] queries;
    
    public AI(Engine engine){
        this.engine = engine.toString();
        this.queries = new String[5];
    }
    
    public String query(String newQuery){
        for(int i = queries.length -1; i > 0; i--){
            queries[i] = queries[i - 1];
        }
        queries[0] = newQuery;
        return "ok got it";
    }
    
    public String[] getQueryHistory(){
        return queries;
    }
    
    
    
    
}





