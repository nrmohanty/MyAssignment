package week3.day1;

public class OnePlus implements Android{

	@Override
	public void openAPP() {
		System.out.println("Open App");
		
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
		
	}

	
	public static void main(String[] args) {
		OnePlus op=new OnePlus();
		op.openAPP();
		op.playVideo();
	}
}
