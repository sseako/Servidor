import java.io.*; 
import java.net.*;  
public class Cliente {

    public static void main(String[] args) throws IOException{
        String sentence;          
        String modifiedSentence;  
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("10.153.159.246", 6789); 
        System.out.println("Ingrese un valor"); 
        sentence = inFromUser.readLine();
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        sentence = inFromUser.readLine();          
        outToServer.writeBytes(sentence + '\n');          
        modifiedSentence = inFromServer.readLine(); 
        System.out.println("FROM SERVER: " + modifiedSentence);           
        clientSocket.close();    
} 
}
       
    








