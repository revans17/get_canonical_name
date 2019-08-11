import java.io.*;
import java.util.*;
public class cmdLineAccess{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String command = sc.nextLine();
          String name = "";
          try{
               Process rt = Runtime.getRuntime().exec(command);
                    BufferedReader reader =  new BufferedReader(new InputStreamReader(rt.getInputStream()));
                    String line = "";
                    while((line = reader.readLine()) != null) {
                         if (line.startsWith("Name:")) {
                              name = line;
                              break;
                         }
                    }
                    System.out.println(name.replace("Name:", "").trim());
          }catch(Exception e){
               System.out.println("Error");
          }
     }
}
