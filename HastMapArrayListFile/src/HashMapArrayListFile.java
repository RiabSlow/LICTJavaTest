import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Sakkar on 2/8/2017.
 */
public class HashMapArrayListFile {

    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        File file=new File("D:\\LICTText\\HastMapArrayListFile\\src\\List");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String s1;
            while ((s1=bufferedReader.readLine())!=null){
                arrayList.add(s1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap hashMap=new HashMap();
        for (int i=0;i<arrayList.size();i++){
            hashMap.put(arrayList.get(i),i);
        }
        Object[] s=hashMap.keySet().toArray();
        for(Object name:s){
            System.out.println(""+name+" is at "+hashMap.get(name));
        }
    }

}
