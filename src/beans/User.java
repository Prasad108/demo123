package beans;
public class User 
{
	private String uid,pwd,fname,lname,email,contact;
	Address address;

	public User() {   
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uid, String pwd, String fname, String lname, String email, String contact, String area,String city,String pincode) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.address=new Address(area, pincode, city);
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", contact=" + contact + ", address=" + address + "]";
	}

	
	
	
	
}
