

package com.example.test;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sonata.mvc.model.Products;
import com.sonata.mvc.repository.ProductRepository;



@DataJpaTest



@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductTest {
    @Autowired
    public ProductRepository prepository;
    Optional<Products> p1;
    
      @Test
      public void getAllProductsTest(){

           List<Products> Products = prepository.findAll();
            Assertions.assertThat(Products.size()).isGreaterThan(3);
            
            System.out.println(Products);
        }
}












/*package com.example.test;

import org.junit.jupiter.api.Test;

import com.sonata.mvc.model.Products;

public class Producttest {
	private String s;
    //public Producttest(String s) {
    
        @Test
        public void test() {
     Products pn=new Products();
     
		Object car = null;
		Object prodName = car;
		assertEquals(prodName,"car"); 
}
		private void assertEquals(Object prodName, String string) {
			
			
		}
}



@SpringBootTest
@ActiveProfiles("test")

public class Producttest {
  
   
   @Autowired
   private Products products;

	@Test
	 public void whenProdIdIsProvided_thenRetrievedProdIdIsCorrect() {
	      Mockito.when(products.getProdId()).thenReturn("Product Id");
	      long testName = Products.getProdId();
	      Assert.assertEquals(" Product Id", testName);
	   }
	}*/

