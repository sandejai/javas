package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Serializable {

	private static final long serialVersionUID = 1L;

	String name = "sandeep";


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SerializationTest st1 = null;;
		SerializationTest st = new SerializationTest();

		try {
			FileOutputStream fos = new FileOutputStream("MyObjFile.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);

			
			os.writeObject(st);
			os.flush();
			os.close();


		} catch (IOException e) {

			e.printStackTrace();
		}

			try {
				FileInputStream fis; fis = new FileInputStream("MyObjFile.ser");
				ObjectInputStream is = new ObjectInputStream(fis);
				st1 = (SerializationTest)is.readObject();
				
				is.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("SerializationTest.main()" + st1.name);
			
			
		

	}
/*
	private void writeObject(ObjectOutputStream os) {
		try {

		} catch (Exception e) {
			System.out.println("SerializationTest.writeObject()");
		}
	}

	private void readObject(ObjectInputStream is) {
		try {

		} catch (Exception e) {
			System.out.println("SerializationTest.readObject()");
		}
	}*/

}
