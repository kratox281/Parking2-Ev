package Proyecto2;

import java.util.HashMap;
import java.util.Map;

public class DepositoUtil {
    protected Map<String,Integer> deposito = new HashMap<String,Integer>();
    public DepositoUtil(){
        deposito.put("01c",100);
        deposito.put("02c",100);
        deposito.put("05c",100);
        deposito.put("10c",100);
        deposito.put("20c",100);
        deposito.put("50c",100);
        deposito.put("1e",100);
        deposito.put("2e",100);
        deposito.put("5e",100);
        deposito.put("10e",100);
        deposito.put("20e",100);
        deposito.put("50e",100);
        deposito.put("100e",100);
        deposito.put("200e",100);
        deposito.put("500e",100);
    }
}
