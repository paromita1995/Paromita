package com;

public class Login {
	
		String username;
		String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean check()
		{
		if(username.equals("NIIT")&& password.equals("123"))
			return true;
		else
			return false;
			
		}
	}



