import java.io.*; 
import java.net.*;  
public class Cliente {

import java.io.*;  
import java.net.*;  

 
    public static void main(String argv[]) throws Exception  
    {  
        String sentence;  
        String modifiedSentence;  
} 

    public static void main(String[] args) {
        String sentence;          
        String modifiedSentence;  
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("hostname", 6789);  
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   
<<<<<<< HEAD
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        sentence = inFromUser.readLine();          
        outToServer.writeBytes(sentence + '\n');          
        modifiedSentence = inFromServer.readLine(); 
        System.out.println("FROM SERVER: " + modifiedSentence);           
        clientSocket.close(); 
    }
=======

    } // hola

>>>>>>> de8eac237b483bc9230910b21977540405d145ad
}
