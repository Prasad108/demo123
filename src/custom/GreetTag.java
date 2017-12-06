package custom;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport 
{
	String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	@Override
	public void doTag() throws JspException, IOException 
	{	
		super.doTag();
		
		JspWriter out=getJspContext().getOut();
		out.println("<h1 style='color:blue'>Welcome  "+user+"</h1>");
		//getJspContext().getOut().println("Welcome");
	}
	
	
}
