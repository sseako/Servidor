import java.io.*; 
import java.net.*;  
public class Cliente {

    public static void main(String[] args) throws IOException{
        String sentence;          
        String modifiedSentence;  
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789); 
    //System.out.println("Ingrese un valor"); 
        sentence = inFromUser.readLine();
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
        System.out.println("Enviando valor al servidor");    
        outToServer.writeBytes("1000" + '\n');
        System.out.println("Valor enviado al servidor");         
        modifiedSentence = inFromServer.readLine(); 
        System.out.println("FROM SERVER: " + modifiedSentence);           
        clientSocket.close();    
} 
}
       // Diego Alfaro alvarado
       // Fabricio Alvarez Valverde 
       // Daniel Gatgens Malespin 
       // Joshua soto 
    








