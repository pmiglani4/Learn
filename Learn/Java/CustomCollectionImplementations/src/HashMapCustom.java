
public class HashMapCustom<K,V> {
	
	private Entry<K,V>[] table;   //Array of Entry.
    private int capacity= 4;  //Initial capacity of HashMap
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		public Entry(K key, V value, Entry<K,V> next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}
	
	@SuppressWarnings("unchecked")
	public HashMapCustom(){
		table=new Entry[capacity];
	}
	
	public V put(K newKey, V data){
		if(newKey==null)
			return null;
		Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
		int hash=hash(newKey);
		if(table[hash]==null){
			table[hash]=newEntry;
		}else{
			Entry<K,V> previous = null;
	        Entry<K,V> current = table[hash];
			while(current!=null){
				if(current.key.equals(newKey)){
					if(previous==null){
						newEntry.next=current.next;
						table[hash]=newEntry;
					}else{
						newEntry.next=current.next;
						previous.next=newEntry;
					}
					return current.value;
				}
				previous=current;
				current=current.next;
			}
			previous.next=newEntry;
		}
		return null;
	}
	
	public V get(K key){
		int hash=hash(key);
		if(table[hash]==null){
			return null;
		}else{
			Entry<K,V> temp=table[hash];
			while(temp!=null){
				if(temp.key.equals(key)){
					return temp.value;
				}
				temp=temp.next;
			}
			return null;
		}
	}
	
	public void display(){
		for(int i=0;i<capacity;i++){
			Entry<K,V> entry = table[i];
			while(entry!=null){
				System.out.println("Key is: "+entry.key+" Value is: "+entry.value);
				entry=entry.next;
			}
			
		}
	}

	private int hash(K key) {
		return Math.abs(key.hashCode())%capacity;
	}
	
	public boolean remove(K key) {
		int hash=hash(key);
		if(table[hash]==null){
			return false;
		}else{
			Entry<K,V> previous = null;
	        Entry<K,V> current = table[hash];
	        
	        while(current != null){
	        	if(current.key.equals(key)){
	        		if(previous==null){
	        			table[hash]=current.next;
	        			return true;
	        		}else{
	        			previous.next=current.next;
	        			return true;
	        		}
	        	}
	        	previous=current;
	        	current=current.next;
	        }
	        return false;
		}
	}
	
	public boolean contains(K key){
		int hash=hash(key);
		if(table[hash]==null){
			return false;
		}else{
			Entry<K,V> temp=table[hash];
			while(temp!=null){
				if(temp.key.equals(key)){
					return true;
				}
				temp=temp.next;
			}
			return false;
		}
	}
	
	public void displaySet(){
	       
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  Entry<K, V> entry=table[i];
	                  while(entry!=null){
	                        System.out.print(entry.key+" ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	    }

	public static void main(String[] args) {
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
        hashMapCustom.put(21, 12);
        hashMapCustom.put(25, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);

        System.out.println("value corresponding to key 21="
                     + hashMapCustom.get(21));
        System.out.println("value corresponding to key 51="
                     + hashMapCustom.get(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                     + hashMapCustom.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                     + hashMapCustom.remove(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();
        
        
        HashMapCustom<Employee, Integer> hashMapCustom_emp = new HashMapCustom<Employee, Integer>();
        hashMapCustom_emp.put(new Employee("10", "sam"), 12);
        hashMapCustom_emp.put(new Employee("21", "amy"), 121);
        hashMapCustom_emp.put(new Employee("31", "rob"), 151);
        hashMapCustom_emp.put(new Employee("41", "sam"), 15);
        hashMapCustom_emp.put(new Employee("42", "wil"), 89);
       
            System.out.println("Display values corresponding to keys>");
            System.out.println("value corresponding to employee with id=21 & name='amy' : "+hashMapCustom_emp.get(new Employee("21", "amy")));
            System.out.println("value corresponding to employee with id=51 & name='pat' : "+hashMapCustom_emp.get(new Employee("51", "pat")));
            
         System.out.print("Displaying : ");
         hashMapCustom_emp.display();
        
         System.out.println("\n\nvalue corresponding to employee with id=21 & name='amy' removed: "+hashMapCustom_emp.remove(new Employee("21", "amy")));
         System.out.println("value corresponding to employee with id=51 & name='pat' removed: "+hashMapCustom_emp.remove(new Employee("51", "pat")));
            
            System.out.print("Displaying : ");
            hashMapCustom_emp.display();

	}

}
