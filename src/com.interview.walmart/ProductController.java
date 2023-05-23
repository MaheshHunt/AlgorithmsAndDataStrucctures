/**
 * 
 */
package com.interview;

/**
 * @author Addula Umamahesh
 *
 */
@RestController(path="/zensor-api/product/{version}/")  
public class ProductController {
	
	@Autowired 
	ProductService  productService ; 
	
	
	@GetMapping(""); 
	public List<Product> getProducts() {
		
		return  productService.getAllProducts() ; 
		
	}
	
	@PostMapping("product"); 
	public Response addProduct(@PathVariable  Product product) {
		boolean result = productService.addProduct(product);
		Response response = Response.ok(result);
		return response ; 
	}
	
	

}
