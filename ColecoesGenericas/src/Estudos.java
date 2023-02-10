import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Estudos {

	public static void main(String[] args) {
		HashMap<String, Integer> cidadesHabitantes = new HashMap();
		
		cidadesHabitantes.put("Goiânia", 4334598);
		cidadesHabitantes.put("São Paulo", 49282768);
		cidadesHabitantes.put("Brasília", 96736887);
		
		Set set = cidadesHabitantes.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry entrada = (Map.Entry)i.next();
			System.out.println("Chave: " + entrada.getKey() + 
					" - Valor: " + entrada.getValue());
		}
	}

}
