public class Main{
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Queue{
        Node rear;
        Node front;
        
        Queue(){
            this.front=null;
            this.rear=null;
        }
        
        void offer(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                front=rear=newnode;
                return;
            }
            
            rear.next=newnode;
            rear=newnode;
        }
        
        int poll(){
            if(isEmpty()){
                System.out.println("Condition of underflow");
                return -1;
            }            
            
            int temp=front.data;
            front=front.next;
            
            if(front==null){
                rear=null;
            }
            
            return temp;
        }
        
        boolean isEmpty(){
            return front==null;
        }
        
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
        
        void display(){
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Queue q=new Queue();
        q.offer(10);
        q.offer(11);
        q.offer(20);
        q.offer(50);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println("Front:"+q.peek());
        System.out.println("Removed element:"+q.poll());
        q.display();
    }
}
