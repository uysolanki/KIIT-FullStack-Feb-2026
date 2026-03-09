package day17;

import java.io.File;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductDriver {

	public static void main(String[] args) 
	{
		ObjectMapper mapper = new ObjectMapper();
        try
        {
            Product product = mapper.readValue(
            	new File("D:\\jsondata\\product1.json"),	   						//absolute path
                //new File("myfolder/product.json"),							       //relative path
                new TypeReference<Product>() {}
            );
            
           System.out.println(product);
       
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
