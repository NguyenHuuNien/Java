
package saveLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SaveLoad {
    public static <E> void SaveData(List<E> dsData, File pathj) throws IOException{
        File path = new File("data.txt");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            
            
            
            ois.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static <E> List<E> LoadData(){
        
    }
}
