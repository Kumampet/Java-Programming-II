import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.file.*;


public class SimpleHTTPServer {
  private final int port;
  public SimpleHTTPServer(int port)
  {
    this.port = port;
  }

  public void start() {
    //
    // Start a ServerSocker
    // wait for connection
    // then send the corresponding socket to an instance of Handler
    // and let it handle the request
    try{
      int p = Integer.parseInt(port);
      Random random = new Random();

      ServerSocket ss = new ServerSocket(p);

      while(true){
        Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        DataOutpuStream dos = new DataOutpuStream(os);
        dos.writeInt(random.nextInt());
      }
      s.close();
    }
  }
}


private class Handler {
  private final Socket connection;
  private InputStream inputStream = null;
  private OutputStream outputStream = null;
  private DataInputStream dataInputStream = null;
  private DataOutpuStream dataOutputStream = null;
  private BufferedReader charStream = null;

  Handler(Socket connection) {
    this.connection = connection;
  }

  public void start() {
    // Get InputStream and OutputStream from the socket.
    //
    // 1. read the request from the client.
    // 2. if it is not starting by "GET" then ignore
    // 3. otherwise, extract the file name from the request.
    // It will look like: "GET /filename.html HTTP/1.1"
    // You can split the string by whitespaces.
    // 4. open the file and reads its content
    // 5. create an HTTP header
    // 6. send the header then the content via the OutputStream
    try{
      charStream = new BufferedReader(new InputStreamReader(System.in));
      message = new String("This is Client");
      socket = new Socket("127.0.0.1", 1056);
      dataStream = new DataInputStream(inputStream);
      outputStream = socket.getOutputStream();
      dataOutputStream = new DataOutpuStream(outputStream);
      dataOutputStream.writeUTF(message);
    }

    while(true){
      try{
        inputStream = socket.getInputStream();
        dataStream = new DataInputStream(inputStream);
        message = dataStream.readUTF();
        System.out.print(message);
        if(message.equals("Exit")){
          System.exit(0);
        }
        message = charStream.readLine();
        dataOutputStream.writeUTF(message);
      }
    }

    return;
  }
}


public static void main(String[] args) {
  int port;
  try {
    port = Integer.parseInt(args[0]);
    if (port < 1024 || port > 65535) port = 8080;
  } catch (RuntimeException ex) {
    port = 8080;
  }

  try {
    SimpleHTTPServer server = new SimpleHTTPServer(port);
    server.start();

  } catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("Usage: java SimpleHTTPServer [port]");
  }
}
