package thread;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
public class Download {
    public static void main(String[] args) throws Exception {
        String[] urls = {
            "https://openhome.cc/Gossip/Encoding/",
            "https://openhome.cc/Gossip/Scala/",
            "https://openhome.cc/Gossip/JavaScript/",
            "https://openhome.cc/Gossip/Python/"
        };
        
        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

//        for(var i = 0; i < urls.length; i++) {
//            var url = urls[i];
//            var fileName = fileNames[i];
//            Files.copy(openStream(url), Paths.get(fileName), REPLACE_EXISTING);
//        }
    }
    
    static InputStream openStream(String uri) throws Exception {
        return HttpClient
                 .newHttpClient()
                 .send(
                     HttpRequest.newBuilder(URI.create(uri)).build(), 
                     BodyHandlers.ofInputStream()
                 )
                 .body();
    }    
}