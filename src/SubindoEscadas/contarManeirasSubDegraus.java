package SubindoEscadas;

import java.util.HashMap;
import java.util.Map;

public class contarManeirasSubDegraus {
    public contarManeirasSubDegraus(int degraus){
        int maneiras = contarManeirasSubDegrausRecursao(degraus);
        System.out.println("Existem " + maneiras + " maneiras de subir os " + degraus + " degraus.");
    }
    private Map<Integer, Integer> memoization = new HashMap<>();
    public int contarManeirasSubDegrausRecursao(int degraus){
        Integer valorDaMemoria = memoization.get(degraus);
        if (valorDaMemoria != null){
            return valorDaMemoria;
        }
        if(degraus < 3){
            return degraus;
        }
        int resultado = contarManeirasSubDegrausRecursao(degraus - 1) + contarManeirasSubDegrausRecursao( degraus - 2);
        memoization.put(degraus, resultado);

        return resultado;
    }
}
