import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter gene: ");

        String gene = input.nextLine();

        adn_codon_count(gene);
    }

    public static void adn_codon_count(String gene) {
        if (validate_adn(gene) == true) {

            int adenine = 0;
            int guanine = 0;
            int cytosine = 0;
            int thymine = 0;

            for (int i = 0; i < gene.length(); i++) {
                switch (gene.charAt(i)) {
                    case 'A':
                        adenine++;
                        break;

                    case 'C':
                        cytosine++;
                        break;

                    case 'G':
                        guanine++;
                        break;

                    case 'T':
                        thymine++;
                        break;

                }
            }


            System.out.println("Adenine: " + adenine);
            System.out.println("Guanine: " + guanine);
            System.out.println("Cytosine: " + cytosine);
            System.out.println("Thymine: " + thymine);
        } else {
            System.out.println("error");
        }


    }

    public static boolean validate_adn(String gene){
        if(gene.length()%3!=0){
            return false;
        }
         for(int i=0;i<gene.length();i++){
             if(gene.charAt(i)!='A'||gene.charAt(i)!='C'||gene.charAt(i)!='G'||gene.charAt(i)!='T'){
                 return false;
             }
         }
        return true;
        }




}
