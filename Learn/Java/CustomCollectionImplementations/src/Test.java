import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		try{
			throw new Throwable();
		}catch(Throwable ex){
			System.out.println(ex);
		}
		
	}
}
