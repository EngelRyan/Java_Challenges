import java.util.*;

public class CinemaReservation {

    public static List<Map<String, Object>> reservarCadeiras(List<Map<String, Object>> cadeiras, List<Integer> cadeirasParaReservar) {
        for (Integer numeroCadeira : cadeirasParaReservar) {
            boolean cadeiraEncontrada = false;
            for (Map<String, Object> cadeira : cadeiras) {
                if (cadeira.get("numero").equals(numeroCadeira)) {
                    cadeiraEncontrada = true;
                    if ((boolean) cadeira.get("reservada")) {
                        System.out.println("Erro: A cadeira " + numeroCadeira + " já está reservada.");
                    } else {
                        cadeira.put("reservada", true);
                    }
                    break;
                }
            }
            if (!cadeiraEncontrada) {
                System.out.println("Erro: A cadeira " + numeroCadeira + " não existe.");
            }
        }
        return cadeiras;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> cadeiras = new ArrayList<>();
        cadeiras.add(new HashMap<String, Object>() {{
            put("numero", 1);
            put("reservada", false);
        }});
        cadeiras.add(new HashMap<String, Object>() {{
            put("numero", 2);
            put("reservada", false);
        }});
        cadeiras.add(new HashMap<String, Object>() {{
            put("numero", 3);
            put("reservada", true);
        }});

        List<Integer> cadeirasParaReservar = Arrays.asList(1, 3, 4);

        List<Map<String, Object>> cadeirasAtualizadas = reservarCadeiras(cadeiras, cadeirasParaReservar);

        System.out.println("Estado atual das cadeiras:");
        for (Map<String, Object> cadeira : cadeirasAtualizadas) {
            System.out.println("Cadeira " + cadeira.get("numero") + ": " + ((boolean) cadeira.get("reservada") ? "Reservada" : "Disponível"));
        }
    }
}