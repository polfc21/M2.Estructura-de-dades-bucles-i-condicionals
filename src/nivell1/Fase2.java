package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Fase2 {
    public static void main(String[] args) {
        List<Character> llistaNom = new ArrayList<>();
        llistaNom.add('l');
        llistaNom.add('e');
        llistaNom.add('o');
        llistaNom.add(' ');
        llistaNom.add('m');
        llistaNom.add('e');
        llistaNom.add('s');
        llistaNom.add('s');
        llistaNom.add('i');
        for (int i = 0; i < llistaNom.size(); i++){
            char lletra = llistaNom.get(i);
            if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u' ||
                    lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U'){
                System.out.println(lletra + " VOCAL");
            } else if (lletra == '0' || lletra == '1' || lletra == '2' || lletra == '3' || lletra == '4' ||
                    lletra == '5' || lletra == '6' || lletra == '7' || lletra == '8' || lletra == '9' ){
                System.out.println(lletra + " Els noms de les persones no contenen números");
            } else if (lletra == ' '){
                System.out.println();
            } else {
                System.out.println(lletra + " CONSONANT");
            }
        }
    }
}
