package beans;

public class Address 
{
	private String area,pincode,city;

	public Address() {
		super();
	}

	public Address(String area, String pincode, String city) {
		super();
		this.area = area;
		this.pincode = pincode;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
}
