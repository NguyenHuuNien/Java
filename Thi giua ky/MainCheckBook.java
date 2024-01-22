package DeDauLau;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainCheckBook {
    private static File file = new File("DanhSachBook.txt");
    
    public static void Save(List<Book> ds){
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            for(var o : ds){
                oos.writeObject(o);
            }
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static List<Book> Load(){
        List<Book> ds = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            while(true){
                try{
                    Book o = (Book) ois.readObject();
                    ds.add(o);
                }catch (EOFException e){
                    break;
                }
            }
            ois.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    public static void main(String[] args) {
        
        // ==============================================================
        List<Book> dsBook = new ArrayList<>();
        
        Author tgNien = new Author("Nguyen Huu Nien", "huunien734@gmail.com", 'H');
        Book a = new Book("Cach lam giau trong 1 gio", tgNien,150.0,100);
        Book b = new Book("Hoc OOP trong 15p", tgNien, 200.0,50);
        Book c = new Book("Cach qua mon OOP", tgNien, 50.0,10);
        Author tgHyu = new Author("Hyu Nie", "hyunie8848@gmail.com",'N');
        Book x = new Book("Cach hack NASA bang HTML", tgHyu, 90.0,45);
        Book y = new Book("Cach tan gai", tgHyu, 56.07,23);
        Book z = new Book("Su tich HKT",tgHyu,43.5,21);
        
        a.setPrice(500.0);
        c.setQty(3);
        
        dsBook.add(a);
        dsBook.add(b);
        dsBook.add(c);
        dsBook.add(x);
        dsBook.add(y);
        dsBook.add(z);
        
        dsBook.get(1).setPrice(50.0);
        dsBook.remove(z); // xoa book z
        dsBook.remove(dsBook.size()-1); // xoa cuon sach o cuoi danh sach
        
        // them lai 2 cuon sach khac
        y = new Book("Cach tan gai hieu qua", tgHyu, 56.07,22);
        z = new Book("Day som de thanh cong",tgHyu,43.5,21);
        z.setQty(4);
        z.setPrice(32.53);
        dsBook.add(z);
        dsBook.add(y);
        
        // ==============================================================
        
        Save(dsBook);
        System.out.println("Save Completed!");

        // ==============================================================
        
        List<Book> dsLoad = new ArrayList<>();
        dsLoad = Load();
        System.out.println(dsLoad.size());
        for(var o : dsLoad){
            System.out.println(o.toString());
        }
        
    }
}
