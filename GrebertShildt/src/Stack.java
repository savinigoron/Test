
public class Stack {
		private int stk[]=new int[10];
		private int tos;
	     Stack() {
			tos=-1;
		}
	     void push(int item){
	    	 if(tos==9){
	    		 System.out.println("Stack is fulled!");
	    	 }
	    	 else
	    		 stk[++tos]=item;
	    	 
	     }
	     int pop(){
	    	 if(tos<0){
	    		 System.out.println("Stack is not full!");
	    		 return 0;
	    	 }
	    	 else
	    		return stk[tos--];
	    		 
	     }

}
