package biz;

public interface IPentionBiz {

	public void checkIn(String roomId, String custNum, String custPhone) throws Exception;
	
	public void checkOut(String roomID) throws Exception;
	
	public void initiallizeRoomData();
	
	public void roomList();
}
