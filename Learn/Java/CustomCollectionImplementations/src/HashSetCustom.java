
public class HashSetCustom<E> {
	
	private HashMapCustom<E, Object> hashMapCustom;
	
	private static final Object PRESENT = new Object();

	public HashSetCustom(){
        hashMapCustom=new HashMapCustom<>();
    }
	
	public boolean add(E value){
		return hashMapCustom.put(value, PRESENT)==null;
	}
	
	public boolean remove(E value){
		return hashMapCustom.remove(value);
	}
	
	public boolean contains(E obj){
        return hashMapCustom.contains(obj);
	}
	
	public void display(){
	    hashMapCustom.displaySet();
	}
	
	public static void main(String[] args) {
	       HashSetCustom<Integer> hashSetCustom = new HashSetCustom<Integer>();
	       hashSetCustom.add(21);
	       hashSetCustom.add(25);
	       hashSetCustom.add(30);
	       hashSetCustom.add(33);
	       hashSetCustom.add(35);
	       hashSetCustom.add(35);
	           
	       System.out.println("HashSetCustom contains 21 ="+hashSetCustom.contains(21));
	       System.out.println("HashSetCustom contains 51 ="+hashSetCustom.contains(51));
	           
	       System.out.print("Displaying HashSetCustom: ");
	       hashSetCustom.display();
	       
	       System.out.println("\n\n21 removed: "+hashSetCustom.remove(21));
	       System.out.println("22 removed: "+hashSetCustom.remove(22));
	           
	       System.out.print("Displaying HashSetCustom: ");
	       hashSetCustom.display();
	       
	       
	       HashSetCustom<Employee> hashSetCustom_emp = new HashSetCustom<Employee>();
	       hashSetCustom_emp.add(new Employee("10", "sam"));
	       hashSetCustom_emp.add(new Employee("21", "amy"));
	       hashSetCustom_emp.add(new Employee("31", "rob"));
	       hashSetCustom_emp.add(new Employee("41", "sam"));
	       hashSetCustom_emp.add(new Employee("42", "wil"));
	      
	       System.out.println("HashSetCustom contains employee with id=21 & name='amy' : "+hashSetCustom_emp.contains(new Employee("21", "amy")));
	           System.out.println("HashSetCustom contains employee with id=51 & name='pat' : "+hashSetCustom_emp.contains(new Employee("51", "pat")));
	           
	        System.out.print("Displaying : ");
	        hashSetCustom_emp.display();
	       
	        System.out.println("\n\nemployee with id=21 & name='amy' removed: "+hashSetCustom_emp.remove(new Employee("21", "amy")));
	        System.out.println("employee with id=51 & name='pat' removed: "+hashSetCustom_emp.remove(new Employee("51", "pat")));
	 
	        System.out.print("Displaying : ");
	        hashSetCustom_emp.display();
	 
	    }
}
