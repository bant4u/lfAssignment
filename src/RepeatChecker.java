

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bijay
 */
class RepeatChecker {
    public static void main(String[] args)
    {
        
    // Scanner sc; 
     String words="this is test this is test"; 
    
        String delimits="[ ,]+";
        String[] token1=words.split(delimits);
       // System.out.println(token1.length);
        String[] token2 =words.split(delimits);
        for(int i=0;i<=token1.length-1;i++)
        {
         int counter; 
            counter = 0;
        for(int j=0;j<=token2.length-1;j++)
            
        {
            if(token1[i].equals(token2[j]))
            {
              counter++; 
              }
                           
        }
        System.out.println(token1[i]+""+counter);
        
    }
    
    
    }
    
}
