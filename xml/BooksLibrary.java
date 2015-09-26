package xml;

/**
 *  This code is provided only for Tutorial Purpose. For More details, 
 *  please refer to Terms Of Usage as defined at http://www.javacommerce.com
 *  The Latest Version of code for this Tutorial can be downloaded from 
 *  Http://www.JavaCommerce.com
 *
 *  @Author Sudhir Ancha
**/

import java.io.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParserFactory;   
import javax.xml.parsers.SAXParser;  

public class BooksLibrary extends DefaultHandler
{
   protected static final String XML_FILE_NAME = "Library1.xml";
   static private Writer  out;
   
   public static void main (String argv [])
   {
       // Use the default (non-validating) parser
       SAXParserFactory factory = SAXParserFactory.newInstance();
       try {
           // Set up output stream
           out = new OutputStreamWriter (System.out, "UTF8");

           // Parse the input
           SAXParser saxParser = factory.newSAXParser();
           saxParser.parse( new File(XML_FILE_NAME), new BooksLibrary() );
          

       } catch (Throwable t) {
           t.printStackTrace ();
       }
       System.exit (0);
   }

  
   //===========================================================
   // Methods in SAX DocumentHandler 
   //===========================================================

   public void startDocument ()
   throws SAXException
   {
	   System.out.println("Sandeep Jaisawal");
      
   }

   public void endDocument ()
   throws SAXException
   {
       try {

           out.flush ();
       } catch (IOException e) {
           throw new SAXException ("I/O error", e);
       }
   }

   public void startElement (String uri, String localName , String qName ,Attributes attrs)
   throws SAXException
   {
	   System.out.println("New Element Found \n" + "uri= " + uri + " localName= "+ localName 
			   +"\n length =" + attrs.getLength());
	   
	   for(int i=0;i<attrs.getLength();i++){
		   System.out.println("attName = " +attrs.getQName(i));
		   System.out.println("attrValue= " +attrs.getValue(i));
	   }
   }

   public void endElement (String name)
   throws SAXException
   {
	   System.out.println("End of Elemenent, name = "+ name);
   }

   public void characters (char buf [], int offset, int len)
   throws SAXException
   {
       String s = new String(buf, offset, len);
      
   }

}
