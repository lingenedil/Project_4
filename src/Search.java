import java.net.*;
import java.io.*;
import net.sf.json.*;
/**
 *
 * @author Lauren
 */
public class Search {
    
    Handler handler = new Handler();
    
    /**
     * Constructor method.
     */
    public Search() {
        
    }
    
    /**
     * Reads the URL and parses it into a String.
     * @param webservice The URL to read.
     * @return Returns the data as a String.
     * @throws Exception
     */
    public static String readURL(String webservice) throws Exception {
        URL oracle = new URL(webservice);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(
        oracle.openStream()));

        String inputLine;
        String result = "";

        while ((inputLine = in.readLine()) != null)
            result = result + inputLine;

        in.close();
        return result;
    }
    
    /**
     * Searches the JSON Object for the character data.
     * @param url The URL to send to readURL()
     * @throws Exception
     */
    public JSONObject search(String url) throws Exception {
        String JSonString = readURL(url);
        JSONObject character = JSONObject.fromObject(JSonString);
        
        return character;
    }
}
