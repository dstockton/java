import java.io.*;
import java.net.*;

public class HTTPGet {

   public static String getHTML(String urlToRead) throws Exception {
      StringBuilder result = new StringBuilder();
      URL url = new URL(urlToRead);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
         result.append(line);
      }
      rd.close();
      return result.toString();
   }

   public static void main(String[] args) throws Exception
   {
     if (args.length == 0) {
       System.out.println("Pass the URL as the first argument");
     } else {
       System.out.println(getHTML(args[0]));
     }
   }
}