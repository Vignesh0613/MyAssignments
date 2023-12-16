package homeassignment.day1;

public class Mobile {
public void makeCall(String mobileModel,float mobileWeight) {
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
public boolean sendMsg(boolean isFullyCharged,int mobileCost) {
	System.out.println(mobileCost);
	return(true);
}
public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.makeCall("One Plus", 110.8f);
	obj.sendMsg(true, 10000);
	System.out.println("This Is My Mobile");
}
}
