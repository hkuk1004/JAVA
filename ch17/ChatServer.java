package ch17;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7001);
			while(true) {
				Socket client = ss.accept();
				DataInputStream dis = new DataInputStream(client.getInputStream());
				BufferedReader br = new BufferedReader(null);
//										보낸 ip 주소				보낸 메세지			
				System.out.println(client.getInetAddress()+"=>"+br.readLine());
				dis.close(); br.close(); client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
