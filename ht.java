import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class ht {

	public static void main(String[] args) {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.println("Who are you?");
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello, " + str + "!");

		String[] ht = { "Heads", "Tails"};
		    Random r = new Random();
		    int h=0;
		    int t=0;
		    for(int i=0 ; i<3 ; i++) {
		      int n = r.nextInt(2);
		      String hot = ht[n];
		      if(n==0)h++;
		      else t++;
		      System.out.println("Round "+(i+1)+":"+hot);
		    }
		      System.out.println("Heads: "+h+", Tails: "+t);

		      if(h>t)System.out.println(str +" won!");
		      else System.out.println(str +" lost!");
	}
}


