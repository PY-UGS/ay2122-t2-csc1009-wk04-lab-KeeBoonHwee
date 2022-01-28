import java.nio.file.*;
public class CheckDNA {
    public static void main(String[] args)
    {
        try
        {
            String dna_sequence1 = new String( Files.readAllBytes( Paths.get( "./dna_sequence1.txt" ) ) );
            String dna_sequence2 = new String( Files.readAllBytes( Paths.get( "./dna_sequence2.txt" ) ) );
            DNA dna1 = new DNA(dna_sequence1);
            DNA dna2 = new DNA(dna_sequence2);
            int count_occurence = 0; 
            count_occurence = dna1.countSequence("GTC");
            System.out.print("\nSample Input 01:\n" + 
                            dna1.highlightSequence("GTC") + 
                            "\n\nOutput 01: sequence \"GTC\" appeared " + 
                            count_occurence + 
                            " times" + 
                            (count_occurence > 10 ? "; infection chance is high.\n" : ".\n"));
            count_occurence = dna2.countSequence("GTC");
            System.out.print("\nSample Input 02:\n" + 
                            dna2.highlightSequence("GTC") + 
                            "\n\nOutput 02: sequence \"GTC\" appeared " + 
                            count_occurence + 
                            " times" + 
                            (count_occurence > 10 ? "; infection chance is high.\n" : ".\n"));
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}