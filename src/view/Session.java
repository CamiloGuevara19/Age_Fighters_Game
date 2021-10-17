package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Session extends Thread{
	
	 private  int number;
	 private BufferedReader reader;
	 private BufferedWriter writer;
	 private Socket socket;
	 private Principal observer;
	 
	 public Session(Socket socket,int id) {
		 this.socket = socket;
		 number = id;
	 }
	 
	 
	 public void setObserver(Principal observer){
	        this.observer = observer;
	        }
	    
	 
	 @Override
	public void run() {
		 OutputStream out;
		try {
			out = socket.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(out));
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			reader = new BufferedReader(isr);
			
			new Thread(
	                ()->{
	                    try {
	                        writer.write("conectado"+"\n");
	                        writer.flush();
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }

	                }
	        ).start();
			
			
			
			while(true) {
				String line = reader.readLine();
				observer.msgRecibido(number,line);
				System.out.println(line);}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			}
	 
	 public void sendMsg(String msg){
	        new Thread(
	                ()->{
	                    try {
	                        writer.write(msg+"\n");
	                        writer.flush();
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }

	                }
	        ).start();
	    }
}
