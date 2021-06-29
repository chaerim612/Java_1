package pk15;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	
	
   //논리적으로 같은 지 확인
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey=(Key)obj;
			if(this.number == compareKey.number ) {
				return true;
			}
		}
		return false;
	}

	//물리적 주소
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	
	

}
