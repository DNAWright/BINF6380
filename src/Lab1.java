import java.util.Random;

public class Lab1 {

    public static void main(String[] args)
    {

        Random rand = new Random();
        int totalAAA = 0;

        //Nested loop that will generate 1,000 random codon by passing in a random number into returnNucleotide fcn.
        for(int x = 0;x < 1000; x++)
        {

            StringBuffer buff = new StringBuffer();

            for(int y=0;y<3;y++)
                {
                buff.append(returnNucleotide(rand.nextInt(100), 12, 38, 39));
                }

            if(buff.toString().equals("AAA"))
            {
                totalAAA++;
            }

            buff.append(" ");
            System.out.print(buff);
        }

            System.out.println("\n" + "Total occurrences of AAA: " + totalAAA);
    }

    // Returns nucleotide based on random number passed in and probability to occur.
    public static String returnNucleotide(int x, int a, int c, int g)
    {

        int lowerBound = a;

        if(x < lowerBound)
        {
            return "A";
        }

        int upperBound = a + c;

        if(x > lowerBound && x < upperBound)
        {
            return "C";
        }

        upperBound += g;

        if(x > lowerBound + c && x < upperBound)
        {
            return "G";
        }

        else
            return "T";
    }
}