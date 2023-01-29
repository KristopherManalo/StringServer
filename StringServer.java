import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String dictionary = new String();
    if(url.getPath().contains("/add-message") { 
        String[] parameters = url.getQuery().split("=");
        if(parameters[0].equals("s")) {
            dictionary.append(parameters[1]+ "\n");    
        }
        return String.format(dictionary);
    }
    else {
        return "404 Not Found!";
    }
}

class StringServer {
        public static void main(String[] args) throws IO Exception {
        if(args.length == 0) {
            System.out.println("Missing port number! Try any number"
                      " between 1024 and  49151");
            return;
        } 

        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
	}
}

