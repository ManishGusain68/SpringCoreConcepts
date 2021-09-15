package springMVC.model;

public class User {
	private String uemail;
	private String uname;
	private String pwd;
	private Address address;

	public String getUemail() {
		System.out.println("fetching email");
		return uemail;
	}

	public void setUemail(String uemail) {
		System.out.println("setting email");
		this.uemail = uemail;
	}

	public String getUname() {
		System.out.println("fetching name");
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("setting user name");
		this.uname = uname;
	}

	public String getPwd() {
		System.out.println("fetching password");
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("setting password");
		this.pwd = pwd;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uemail=" + uemail + ", uname=" + uname + ", pwd=" + pwd + ", address=" + address + "]";
	}

}
