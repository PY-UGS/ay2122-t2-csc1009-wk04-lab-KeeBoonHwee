public class DNA
{
    // private variables
    private String dna_sequence;

    // Constructor
    public DNA(String dna_sequence)
    {
        this.dna_sequence = dna_sequence;
    }

    public int countSequence(String minor_dna_sequence)
    {
        if( this.dna_sequence.contains(minor_dna_sequence) )
        {
            int substr_length = minor_dna_sequence.length();
            int original_length = this.dna_sequence.length();
            String replaced_string = this.dna_sequence.replaceAll(minor_dna_sequence, "");
            int replaced_length = replaced_string.length();
            return ((original_length - replaced_length)/substr_length);
        }
        else
        {
            return 0;
        }
    }

    public String highlightSequence(String minor_dna_sequence)
    {
        if( this.dna_sequence.contains(minor_dna_sequence) )
        {
            String replaced_string = this.dna_sequence.replaceAll(minor_dna_sequence, "\u001B[34m" + minor_dna_sequence + "\u001B[0m");
            return replaced_string;
        }
        else
        {
            return this.dna_sequence;
        }
    }
}