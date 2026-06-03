import java.util.Scanner;
class Node{
    public int value;
    public Node next;
    Node(int v){
        this.value=v;
        this.next=null;
    }
    Node(int v,Node n){
        this.value=v;
        this.next=n;
    }
}
class queue{
    Node front,rear;
     public void enqueue(int v){
        Node newnode=new Node(v);
        if(rear==null){
            rear=newnode;
            front=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty.");
            return ;
        }
        System.out.println("Dequeued:"+front.value);
        front=front.next;
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty.");
            return ;
        }
        Node temp=front;
        while(temp!=null){
            System.out.println(" "+temp.value);
            temp=temp.next;
        }
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        queue q=new queue();
        Scanner in=new Scanner(System.in);
        int i;
        do{
        System.out.println("Enter choice:-");
        System.out.println("1-Enqueue");
        System.out.println("2-dequeue");
        System.out.println("3-display");
        System.out.println("4-Exit");
        i=in.nextInt();
        switch(i){
            case 1:
                System.out.println("Enter value:");
                int n=in.nextInt();
                q.enqueue(n);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                q.display();
                break;
            case 4:
            default:
                break;
        }
            
        }while(i!=4);

    }
}
