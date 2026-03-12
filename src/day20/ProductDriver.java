package day20;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day17.Product;

public class ProductDriver {

	public static void main(String[] args) 
	{
		ObjectMapper mapper = new ObjectMapper();
        try
        {
            List<Product> products = mapper.readValue(
            	//new File("D:\\jsondata\\products.json"),	   						//absolute path
                new File("myfolder/products.json"),							       //relative path
                new TypeReference<List<Product>>() {}
            );
            
           System.out.println(products);
           
           //display title of all electronics products
           products
           .stream()
           .filter(product->"electronics".equalsIgnoreCase(product.getCategory()))
           .map(product->product.getTitle())
           .sorted()
           .forEach(System.out::println);
           
           //display total price of all jewelery products
           double sum=products
           .stream()
           .filter(product->"jewelery".equalsIgnoreCase(product.getCategory()))
           .mapToDouble(Product::getPrice)
           .reduce(0,(price,acc)->acc+price);
           
           System.out.println("Sum of All Jewelery products is "+sum);
           
           
           
       
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
