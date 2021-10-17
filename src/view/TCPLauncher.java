package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPLauncher extends Thread{
	
	private TCPLauncher(){

    }

    private BufferedWriter writer;
    ServerSocket server;
    private String line;
    private static TCPLauncher puertoServer;
   private Principal observer;
   private int id;
   
   public void setObserver(Principal observer){
       this.observer = observer;}
    
    @Override
    public void run() {
        
        	try {
				server = new ServerSocket(5000);
				id = 1;
				while(true) {
				System.out.println("Esperando...");
				Socket socket = server.accept();
				Session session = new Session(socket,id);
				session.setObserver(observer);
				session.start();
				System.out.println("conectado"+id);
				id++;
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }



    public static TCPLauncher getInstance() {
        if(puertoServer==null){
            puertoServer = new TCPLauncher();
        }
        return puertoServer;
    }
    
    


}
