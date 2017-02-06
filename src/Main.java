/**
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * 
 * @author Luis Diego Fernandez
 * @version 2.5.17
 *
 */
public class Main {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String cadena;
		
		//Se lee el archivo datos.txt
		FileReader lecT = new FileReader(System.getProperty("user.dir") + "/datos.txt");
		BufferedReader buff = new BufferedReader(lecT);
		
		//Se incializan los stacks a utilizar, ambos con salido de tipo Fifo.
		Fifo stack = new Fifo();
		Fifo momentaryStack = new Fifo();
		
		//Ciclo while para meter los valores a utilizar, incluyendo los enteros como los operandos.
        while((cadena = buff.readLine())!=null) {
        	int n = 0;
      
            while(n < cadena.length()){
            	int digits = 1;
            	
            	if (!cadena.substring(n, n+1).equals(" ")){
            		
            		try{
            			while (!cadena.substring(n + digits, n + digits + 1).equals(" ")){
            				digits++;
            			}
            			
            		} catch (Exception e){
            			
            		}
            		
            	}
            	
            	stack.addQ(cadena.substring(n, n + digits));
            	n = n + digits;
            }
            
        }
       
        if(stack.getIt() != null){
        	//Se inicializan las variables a utilizar.
        	int result = Integer.parseInt(stack.getIt());
        	boolean operation = false;
        	String operant = "";
        	
        	stack.quitQ();
        	
        	while (operation == false){
        		
        		try{
        			//Siempre que se puda se agregara nuevos valores a momentaryStack, hasta que encuentre un
        			// operando
        			momentaryStack.addQ(Integer.parseInt(stack.getIt()));
        			stack.quitQ();
        			
        		} catch(Exception e){
        			//El catch se encarga de que a la hora de encontrar un operando, se operen todos los 
        			// valores en momentaryStack utilizando dicho operando. Y quita todos los nodos utilizados
        			// en momentaryStack.
        			operant = stack.getIt();
        			
        			if (operant.equals("+")){
        				
        				while (!momentaryStack.getIt().equals("null")){
        					result += Integer.parseInt(momentaryStack.getIt());
        					momentaryStack.quitQ();
        					System.out.println(result);
        				}
        			}
        			
        			else if (operant.equals("-")){
        				
        				while (!momentaryStack.getIt().equals("null")){
        					result -= Integer.parseInt(momentaryStack.getIt());
        					momentaryStack.quitQ();
        				}
        			}
        			
        			else if (operant.equals("*")){
        				
        				while (!momentaryStack.getIt().equals("null")){
        					result = result * Integer.parseInt(momentaryStack.getIt());
        					momentaryStack.quitQ();
        					System.out.println(result);
        				}
        			}
        			
        			else if (operant.equals("/")){
        				
        				while (!momentaryStack.getIt().equals("null")){
        					result = result / Integer.parseInt(momentaryStack.getIt());
        					momentaryStack.quitQ();
        				}
        			}
        			
        			try{
        				stack.quitQ();
            			
            		} catch (Exception d){
            			
            			operation = true;
            			System.out.println(result);
            		}
        			
        		}
        		
        	}
        	
        }
        
        buff.close();
	}
	
}
