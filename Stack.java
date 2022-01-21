public class Stack {
    private class Node{
        public Node next;
        public char data;

        public Node(char dataIn){
            data = dataIn;
            next = null;
        }
    }
    private Node top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean push(char input){
        Node addNode = new Node(input);
        addNode.next = top;
        top = addNode;
        size++;
        return true;
    }

    public char pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        char popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public String toString(){
        String result = "";
        Node temp = top;

        while(temp != null){
            result += temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }
}
