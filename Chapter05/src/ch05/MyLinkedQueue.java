package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}

public class MyLinkedQueue extends MyLinkedList implements Queue{

	MyListNode front; // 맨 앞에 노드
	MyListNode rear; // 맨 뒤에 노드 <- 왜 필요할까?
	
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = addElement(data);
			rear = newNode; // 맨 마지막 node
		}
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		if(front==null) {
			rear = null;
		}
		return data;
	}

	public void printQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData() + ",");
			temp = temp.next;
		}
		System.out.println();
	}

}

