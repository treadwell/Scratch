package data_science;



public class Timing {
	public static void timing() {

        double startTime, endTime, elapsedTime, trash;
        startTime = System.nanoTime();
        trash = 2 ^ 20;
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        
        System.out.println("Training time: " + elapsedTime / 1000000000 + " seconds");
        
	}
	
	
}
