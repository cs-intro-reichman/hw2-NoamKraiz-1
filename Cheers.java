//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

            String cheersWord = args[0];
            int repet = Integer.parseInt(args[1]);
            String letters="aAbBcCdDeEfFgGhHiIjJkKlLnNmMoOpPqQrRsStTuUvVwWxXyYzZ";
            char ch;
            int position;
            String capitalWord = "";

            for(int i=0; i<cheersWord.length(); i++){

                ch = cheersWord.charAt(i);
                position = letters.indexOf(ch);
                if(position%2==0) ch=letters.charAt(position+1);

                if(ch == 'A' || ch == 'E'|| ch == 'F'|| ch == 'H'|| ch == 'H'|| ch == 'I'|| ch == 'L'|| ch == 'M'|| ch == 'N'|| ch == 'O'|| ch == 'R'|| ch == 'S'|| ch == 'X') {
                        System.out.println("Give me an "+ ch+": "+ch+"!");
                }
                else System.out.println("Give me a  "+ ch+": "+ch+"!");
                capitalWord += ch ; 
            }
            System.out.println("What does that spell?");

            int j=0;
            while (j<repet) {
                System.out.println(capitalWord+"!!!");
                j++;
            }
        }
}

