package saveLoad;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SaveLoad {
	public static <E> void Save(List<E> obj, File path) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			for(var o : obj) {
				oos.writeObject(o);
			}
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static <E> List<E> Load(File path){
		List<E> obj = new ArrayList<E>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			while(true) {
				try {
					E o = (E)ois.readObject();
					if(o instanceof E) {
						obj.add(o);
					}
				}
				catch(EOFException e) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
}