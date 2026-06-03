import java.util.Scanner;

class node {
int data;
node next;
 
public node(int data) {
	this.data=data;
	this.next=null;
	
}
}

class queue{
	node front;
	node rear;
	queue(){
		this.front=null;
		this.rear=null;
		
	}
	public boolean isempty() {
		return this.rear==null;
	}
	
	//enqueue
	public void enqueue(int data) {
		node newnode= new node (data);
		if(isempty()) {
			this.front=newnode;
			this.rear=newnode;
			return;
			
		}
		this.rear.next=newnode;
		this.rear=newnode;
	}
	
	public int dequeue() {
		if(this.front==null) {
			return -1;
			}
		int dv= this.front.data;
		this.front=this.front.next;
		if(this.front==null) {
			this.rear=null;
		}
	return dv;
	}
	public int peek () {
		if (this.front==null) {
			return -1;
			
		}
		return this.front.data;
	}
	
	
	
	public void display() {
		if (this.front==null){
			System.out.println("empty queue");
			
		}
		node curr= front;
		while(curr!=null) {
			System.out.println(curr.data+"");
			curr=curr.next;
			
		}
	}
}

public class main {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		queue q= new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		q.display();
		
		System.out.println("peek of first ele:"+q.peek());
		q.enqueue(4);
		System.out.println("after enqueue queue is:");
		q.display();
		q.dequeue();
		System.out.println("after dequeue queue is:");
		q.display();
	
	
	
	}

}
