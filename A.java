import  java.io.*;


public class A
{


public static void main(String [] args)
{int counter = 0;
	try(BufferedReader br = new BufferedReader(new FileReader("/home/sasha/Desktop/Polindrome/words.txt")))
	{
	    
	   
	    String s= new String(); 
	    while((s=br.readLine())!=null)
	    {
				String p = s;
				for (int i = 0; i < p.length(); i++)
				{
					if ( p.charAt(i) != p.charAt(p.length() - i-1) )
						{
							//System.out.println("Not a Polidrome");
							break;
						}

					if (i == p.length()/2)
						
						{
							System.out.println(s);
							counter++;
						}
				}

	        
	    }
	  
	}

	 catch(IOException ex){
	             
	    System.out.println(ex.getMessage());
	}

	  System.out.println(counter); 
}


}