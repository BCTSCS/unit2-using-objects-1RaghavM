import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;

//Default constructor


// Specify website URL
// Register a new website


// Specify website URL
// Register an old website
    public Website(){
        domain="google";
        topLevelDomain="com";
        numUsers = 430_000_000_000l;
        geoLocation = new GeoLocation(40.935,-74.1176);
    }
    
    public Website(String domainName,String topDomain){
        domain= domainName;
        topLevelDomain= topDomain;
        numUsers = 430_000_000_000l;
        geoLocation = new GeoLocation(40.935,-74.1176);
    }
    
    public Website(String domainName,String topDomain,long numPeople,GeoLocation g){
        domain= domainName;
        topLevelDomain= topDomain;
        numUsers = numPeople;
        geoLocation = g;
    }

    // Method to fetch data 
    public void fetchData(String api)
    {
        String urlString=toString()+ "/"+api+"/";
    
        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
    
            System.out.println("Response from the API:");
    
            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    
    public GeoLocation getLocation(){
        return geoLocation;
    }
    
    public String toString()
    {
        
        String res =  "https://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {
        GeoLocation myLocation = new GeoLocation(40.935,-74.1176);
        Website google = new Website("google","com",4_300_000_000l,new GeoLocation(41.2219,95.8608));
        Website amazon = new Website("amazon","com",1_000_000l,new GeoLocation(38.9339,77.1773));
        Website microsoft = new Website("microsoft","com",1_000_000_000l,new GeoLocation(36.6646,78.3897));
        Website facebook = new Website("facebook","com",3_200_000_000l,new GeoLocation(44.2995,120.8346));
        System.out.println(google.getLocation().distanceFrom(myLocation));
        System.out.println(google.getLocation().distanceFrom(amazon.getLocation()));
        System.out.println(google.getLocation().distanceFrom(facebook.getLocation()));
        System.out.println(google.getLocation().distanceFrom(microsoft.getLocation()));
        System.out.println(amazon.getLocation().distanceFrom(facebook.getLocation()));
        System.out.println(microsoft.getLocation().distanceFrom(facebook.getLocation()));
        
    }
}