import java.util.Map;
import java.util.HashMap;
public class MapasEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("usuario1", "contraseña1");
        map.put("usuario2", "contraseña2");
        map.put("usuario3", "contraseña3");
        map.put("usuario4", "contraseña4");

        boolean key = map.containsKey("usuario1");
        boolean value = map.containsValue("contraseña5");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());

        }
        if (map.containsKey("usuario1") && map.containsValue("contraseña6")) {
            System.out.println("Ha accedido, aceptado");
        } else {
            System.out.println("acceso denegado");

        }
    }
}
