package Pertemuan2;

public class BingoSolo {

    public BingoSolo() {
        singBingoSong();
    }

    public void singBingoSong() {
        String bingo = "B-I-N-G-O";
        String[] clapVersions = { "(clap)-I-N-G-O", "(clap)-(clap)-N-G-O", "(clap)-(clap)-(clap)-G-O", 
                                  "(clap)-(clap)-(clap)-(clap)-O", "(clap)-(clap)-(clap)-(clap)-(clap)" };

        for (int i = 0; i <= clapVersions.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            if (i == 0) {
                System.out.println(bingo);
                System.out.println(bingo);
                System.out.println(bingo);
            } else {
                for (int j = 0; j < 3; j++) {
                    System.out.println(clapVersions[i - 1]);
                }
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        new BingoSolo(); 
    }
}
