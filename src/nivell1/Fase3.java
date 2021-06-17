package nivell1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase3 {
    public static void main(String[] args) {
        char[] nomComplet = {'L','e','o',' ','M','e','s','s','i'};
        Map<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nomComplet.length; i++){
            char lletra = nomComplet[i];
            if (mapa.containsKey(lletra)){
                int valor = mapa.get(lletra);
                valor++;
                mapa.replace(lletra,valor);
            }else{
                mapa.put(lletra,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()){
            char clau = entry.getKey();
            int valor = entry.getValue();
            System.out.println("clau=" + "'" + clau + "', valor=" + valor);
        }
    }
}
