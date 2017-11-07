//8-9
class UnsupportedFuctionException extends RuntimeException{
	private final int Err_Code;
	
	UnsupportedFuctionException(String msg,int errCode){
		super(msg);
		Err_Code = errCode;
	}
	
	UnsupportedFuctionException(String msg){
		this(msg,100);
	}
	
	public int getErrCode() {
		return Err_Code;
	}
	
	public String getMessage() {
		return "["+getErrCode()+"]"+super.getMessage();
	}
}

public class ex4 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
}

//8-10
/*
2
4
7
*/