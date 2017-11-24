import java.io.*;
import java.util.*;
public class Solution {
    Queue queue;
    Stack stack;
    
    public Solution(){
       queue = new LinkedList();
       stack = new Stack();
    }
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    public char popCharacter(){
        return (char) stack.pop();
    }
    
    public char dequeueCharacter(){
        return (char) queue.poll();
    }

    
