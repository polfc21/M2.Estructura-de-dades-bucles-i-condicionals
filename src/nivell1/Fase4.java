package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Fase4 {
    public static void main(String[] args) {
        List<Character> llistaNom = new ArrayList<>();
        llistaNom.add('L');
        llistaNom.add('E');
        llistaNom.add('O');
        List<Character> llistaCognom = new ArrayList<>();
        llistaCognom.add('M');
        llistaCognom.add('E');
        llistaCognom.add('S');
        llistaCognom.add('S');
        llistaCognom.add('I');
        List<Character> fullName = new ArrayList<>();
        fullName.addAll(llistaNom);
        fullName.add(' ');
        fullName.addAll(llistaCognom);
        System.out.print("[");
        for (int i = 0; i < fullName.size(); i++){
            char lletra = fullName.get(i);
            if (i == fullName.size()-1) System.out.println(lletra + "]");
            else System.out.print(lletra+",");
        }
    }
}
