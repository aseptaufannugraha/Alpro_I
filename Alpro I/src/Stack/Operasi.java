package Stack;

public class Operasi {
	int[] dataStack = new int[10];
	int top = -1;
	int jmlData = 0;
	
	boolean isEmpty() {
		return(top == -1);
	}
	
	boolean isFull()  {
		return(top == 9);
	}
	
	int dataSize() {
		jmlData = top + 1;
		return(jmlData);
	}
	
	void push(int dataPush) {
		if(isFull()) {
			System.out.println("Stack Penuh");
		} else {
			top++;
			dataStack[top] = dataPush;
			System.out.println("Data sudah tersimpan");
		}
		dataSize();
	}
	
	int pop(int dataAkhir) {
		int temp = 0;
		if(isEmpty()) {
			System.out.println("Stack masih kosong");
		} else {
			temp = dataStack[top];
			top--;
		}
		dataSize();
		return(temp);
	}
	
	void tampilData() {
		if(!isEmpty()) {
			System.out.println("Isi Stack: ");
			for(int i=0; i<jmlData; i++) {
				System.out.println(dataStack[i]);
			}
		} else {
			System.out.println("Stack Kosong");
		}
	}
	
}
