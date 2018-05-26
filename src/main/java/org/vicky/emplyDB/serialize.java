package org.vicky.emplyDB;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class serialize implements Serializable {
	Date d;
	public serialize() {
		d = new Date();
		
	}
	public void performsrc() throws IOException {
		try {
			FileOutputStream fs = new FileOutputStream("file.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
