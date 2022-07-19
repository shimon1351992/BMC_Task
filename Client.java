import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client  extends Thread{


    public static void main(String[] args) throws IOException {
        Socket s = new Socket(args[0] 666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(args[2]);
        dout.flush();
        dout.close();
        s.close();
    }
}
