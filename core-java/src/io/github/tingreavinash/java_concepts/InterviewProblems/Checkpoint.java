package io.github.tingreavinash.java_concepts.InterviewProblems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Your CheckpointArray object will be instantiated and called as such:
 * CheckpointArray obj = new CheckpointArray(length);
 * obj.set(index,intVal);
 * String checkpoint = obj.checkpoint(); 
 * int value = obj.get(index,checkpoint);
 */
class CheckpointArray {
	ArrayList<long[]> arr_list  = new ArrayList<long[]>();
	
	long[] arr;
	int check_id=0;
	
    public CheckpointArray(int length) {
        arr = new long[length];
    }
    
    public void set(int index, int intVal) {
    	
    	arr[index] = intVal;
    
    }
    
    public int checkpoint() {
    	long[] old_arr = new long[arr.length];
    	for (int i=0;i<=arr.length-1;i++) {
    		old_arr[i]=arr[i];
    	}
    	arr_list.add(old_arr);

    	int id = check_id++;
    	return id;
    }
    
    public int get(int index, int checkpointId) {

    	long[] current_arr = arr_list.get(checkpointId);
    	int val = (int) current_arr[index];
    	return val;
    }
}

class Checkpoint {
	
	public static void main(String [] args) {
		String[] commands= { 
				  "new 4",
				  "set 0 100",
				  "set 1 200",
				  "set 2 300",
				  "set 3 400",
				  "checkpoint",
				  "get 1 0",
				  "set 1 201",
				  "checkpoint",
				  "get 1 1",
				  "get 1 0"
				};
		//String[] commands = {"new 2", "set 0 10", "checkpoint", "get 1 0"};
		long[] result = solution(commands);
		System.out.println(Arrays.toString(result));
	}
    
  public static long[] solution(String[] commands) {

    CheckpointArray obj = new CheckpointArray(0);
    Set<Long> checkpoints = new HashSet<>();
    long[] output = new long[commands.length];
    
    for (int i = 0; i < commands.length; i++) {
      output[i] = Long.valueOf(-1);
    }

    for (int i = 0; i < commands.length; i++) {
      String command = commands[i];
      String[] tokens = command.split("\\s+");

      if ("new".equalsIgnoreCase(tokens[0])) {
        obj = new CheckpointArray(Integer.valueOf(tokens[1]));

      } else if ("set".equalsIgnoreCase(tokens[0])) {
        obj.set(Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]));

      } else if ("checkpoint".equalsIgnoreCase(tokens[0])) {
        output[i] = Long.valueOf(obj.checkpoint());
        checkpoints.add(output[i]);

      } else if ("get".equalsIgnoreCase(tokens[0])) {
        int cpId = Integer.valueOf(tokens[2]);
        if (checkpoints.contains(Long.valueOf(cpId))) {
          output[i] = Long.valueOf(obj.get(Integer.valueOf(tokens[1]), cpId)) ;
        }
      }
    }
    return output;
  }
}
