package test;

import java.io.IOException;

import com.service.impl.UserServiceImpl;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			//System.out.println("HelloWorld") ;
			UserServiceImpl userImpl=new UserServiceImpl();
			userImpl.selectAll();
	} 

}
