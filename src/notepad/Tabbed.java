package notepad;

/**
 *
 * @author NCCS
 */
public class Tabbed {
    
    public static void main(String[] args){
        
        Entry1 ho = new Entry1();
        ho.setVisible(true);
        
        try{
        for(int x = 0; x <= 100; x++)
        {
         Thread.sleep(40); 
         
         Entry1.lblord1lord.setText(Integer.toString(x)+"%");
         Entry1.loadbar.setValue(x);
         
         
             
        }    
        }
        catch (Exception e){
            
        }
        
    }
}
