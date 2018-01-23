class MyQueue {
    Stack<Integer> myStack;
    //Stack<Integer> myQueueStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        myStack = new Stack(); 
        //myQueueStack = new Stack(); 
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
       myStack.push(x); 
    }
    
    //Creating Helper method, to reverse the stack 
    
    public Stack revStack(Stack inputStack){
        Stack<Integer> myRevStack;
        myRevStack = new Stack();
        int size = inputStack.size(); 
        for(int i = 0; i < size; i++){
           int val; 
           val = myStack.pop(); 
           myRevStack.push(val);
            
       }
        return myRevStack;
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //if( myStack.empty() == false ){ 
            myStack = revStack(myStack);
            int pop = myStack.pop();
            myStack = revStack(myStack);
            return pop; 
       // } 
       // else{
      //      return -1; 
      //  }
        
    }
    
    /** Get the front element. */
    public int peek() {
       // if( myStack.empty() == false ){
            myStack = revStack(myStack);
            int peek = myStack.peek(); 
            myStack = revStack(myStack);
            return peek;
       // }
        //return -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return myStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
