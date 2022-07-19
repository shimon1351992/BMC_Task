import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client  extends Thread{


    public static void main(String[] args) throws IOException {
        Socket s = new Socket("172.19.144.1",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("C:\\WINDOWS");
        dout.flush();
        dout.close();
        s.close();
    }
}
