import java.util.Random;

public class Lab1 {

    public static void main(String[] args){

        Random rand = new Random();
        int totalAAA = 0;

        //First loop that will continue until we create 1,000 3mers
        for(int x = 0;x < 1000; x++){

            // New StringBuffer that will be used to create a nucleotide 3mer.
            StringBuffer buff = new StringBuffer();

            //Nested loop that will create 3 random nucleotides
            for(int y=0;y<3;y++){

                // Random generator to return an int between 0-3 with even probability (.25 per)
                buff.append(returnAA(rand.nextInt(100), 12, 38, 39));
                }

                //Check to see if the 3mer created matches the AAA amino acid
            if(buff.toString().equals("AAA")){
                totalAAA++;
            }
            buff.append(" ");
            System.out.print(buff);
        }
            System.out.println("\n" + "Total occurrences of AAA: " + totalAAA);
    }

        // Public method that takes in a random int between 0-100 and the probabilities for a given nucleotide to occur
        // Then returns the character representation for that random int

    public static String returnAA(int x, int a, int c, int g){

        int lowerBound = a;

        if(x < lowerBound){
            return "A";
        }
        int upperBound = a + c;
        if(x > lowerBound && x < upperBound){
            return "C";
        }
        upperBound += g;
        if(x > lowerBound + c && x < upperBound){
            return "G";
        }
        else
            return "T";
    }
}


/* To get probabilities, get a random bound of 100, and anything within certain range will be that probability
    Can change returnAA method to work with probabilities. Can use the probabilities to create lower and upper bounds.

    	p(A) = 0.12 --> x < 12
		p(C) = 0.38 --> x > 12 && x < 50
		p(G) = 0.39 --> x > 50 && x < 89
		p(T) = 0.11 --> x > 89

 */