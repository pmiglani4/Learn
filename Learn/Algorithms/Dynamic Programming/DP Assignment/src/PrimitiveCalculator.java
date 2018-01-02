import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> greedy_optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
            sequence.add(n);
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }
    
    private static List<Integer> dp_optimal_sequence(int n) {
        int minOperations[] = new int[n+1];
        minOperations[1]=0;
        int val=Integer.MAX_VALUE;
        for(int i=2;i<=n;i++){
        	val=Integer.MAX_VALUE;
        	if (i % 3 == 0) {
        		val=Math.min(val, minOperations[i/3]);
            }
        	if (i % 2 == 0) {
        		val=Math.min(val, minOperations[i/2]);
            }
        	val=Math.min(val, minOperations[i-1])+1;
        	minOperations[i]=val;
        }
        List<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
        	sequence.add(n);
        	if(n%3 == 0 && minOperations[n/3]+1 == minOperations[n]){
        		n=n/3;
        	}else if(n%2 == 0 && minOperations[n/2]+1 == minOperations[n]){
        		n=n/2;
        	}else{
        		n=n-1;
        	}
        }
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int n = 1;
        List<Integer> sequence = dp_optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

