import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String returnString = "";
    public String handleRequest(URI url) {     
        if(url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")) {
                returnString = returnString + parameters[1] + "\n";
                return String.format(returnString);
            }
        }
    return "404 Not Found";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
        System.out.println("Missing port number: Insert number 1024 to 49151");
        return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
