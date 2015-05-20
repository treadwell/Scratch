package data_science;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class JSONTest {

  public static void main(String[] args) throws FileNotFoundException {

    HashMap<String, HashMap<String, HashMap<String, HashMap<String, Double>>>> example = new HashMap<String, HashMap<String,HashMap<String,HashMap<String,Double>>>>();

    String[] approach = {"rhc", "ga", "sa"};
    Integer[] param1 = { 5, 6, 7, 8, 9, 10 };
    Integer[] param2 = { 50, 500, 5000, 50000 };
    Integer trials = 10;

    for (Integer p1 : param1) {

      example.put(p1.toString(), new HashMap<String, HashMap<String,HashMap<String,Double>>>());

      for (Integer p2 : param2) {

        example.get(p1.toString()).put(p2.toString(), new HashMap<String,HashMap<String,Double>>());
        
	        for (Integer trial=1; trial<trials+1; trial++) {
	
		        example.get(p1.toString()).get(p2.toString()).put(trial.toString(), new HashMap<String,Double>());
		        	
		        example.get(p1.toString()).get(p2.toString()).get(trial.toString()).put("somekey1", (double) 1 * p2 * p1 * trial);
		        example.get(p1.toString()).get(p2.toString()).get(trial.toString()).put("somekey2", (double) 10 * p2 * p1 * trial);
		        example.get(p1.toString()).get(p2.toString()).get(trial.toString()).put("somekey3", (double) 100 * p2 * p1 * trial);
		        example.get(p1.toString()).get(p2.toString()).get(trial.toString()).put("somekey4", (double) 1000 * p2 * p1 * trial);
        
	        }

      }

    }

    JSONObject myObject = new JSONObject(example);

    PrintWriter out = new PrintWriter("output.json");

    out.println(myObject.toJSONString());

    out.close();
    
    System.out.println(example.get("5").get("50").get("1"));
    System.out.println(example.get("5").get("50"));
    
  }

}
