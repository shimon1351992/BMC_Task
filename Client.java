import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        Socket s = new Socket(args[0],6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(args[1]);
        dout.flush();
        dout.close();
        s.close();
    }
}
