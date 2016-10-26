public class Member{
	private String username, password, address, phoneNumber;
	private int accountNumber;
	
	public Member(String u, String p, String a, String pN, int aN){
		username = u;
		password = p;
		address = a;
		phoneNumber = pN;
		accountNumber = aN;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String u){
		username=u;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String p){
		password=p;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String a){
		address=a;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String pN){
		phoneNumber=pN;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(int aN){
		accountNumber=aN;
	}
}