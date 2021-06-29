package pk14;

public class BookShelf extends Shelf implements Queue{

	//구현메서드
	@Override
	public void enQueue(String title) {
	
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//지우면서 지워지는 원소를 반환해줌
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
