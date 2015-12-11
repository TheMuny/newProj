package IceCreamFactory.XmlTests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.thoughtworks.xstream.XStream;

import IceCreamFactory.Children;

/**
* Демонстрируем сериализацию в xml и десериализацию оттуда
*
* @author Pavel
*
*/
public class XmlSerializator {



   /**

    * @param args
 * @throws IOException 

    */

   public static void main(String[] args) throws IOException {

      XStream xstream = new XStream(); // require XPP3 library
      xstream.alias("Children",  Children.class);
      // Serialize
      Children sclassOut = new Children();
      String xml = xstream.toXML(sclassOut);

//      String fileName = "Readable.txt";
//      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
//      os.writeObject(xml);
//      os.close();
      System.out.println(xml);

      
      // Deserialize
      Children sclassIn = (Children) xstream.fromXML(xml);

      
//      System.out.println("sclassOut == sclassIn: " + (sclassOut == sclassIn));/**here shell be false because 
//      serializable and deserializable objects are difference even if they are same*/
//
//      System.out.println("sclassOut.intfield == sclassIn.intfield: " + (sclassOut.getColor() == sclassIn.getColor()));
//
//      System.out.println("sclassOut.doublefield == sclassIn.doublefield: " + (sclassOut.getSize() == sclassIn.getSize()));
// 
        
   }
   }

      
