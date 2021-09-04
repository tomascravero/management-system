package com.example.betatest.model.users;

import java.sql.Blob;

public interface IUser {

	public String getFirstName();
	
	public String getLastName();
	
	public String getCompleteName();

	public int getUserAge();

	public String getUserEmail();

	public Blob getUserPhoto();

}
