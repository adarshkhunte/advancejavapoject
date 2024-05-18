package com.jspiders.hibernatemanytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowPrintStacktrace;

import com.jspiders.hibernatemanytomany.dto.CustomerDTO;
import com.jspiders.hibernatemanytomany.dto.ProductDTO;

public class CustomerProductDAO {

	
		 private static  EntityManagerFactory factory;
	     private static  EntityManager manager;
		 private static EntityTransaction transaction;
		 
		 
			 
			 private static void openConnection(){
				 factory=Persistence.createEntityManagerFactory("ManyToMany");
				 manager=factory.createEntityManager();
				 transaction=manager.getTransaction();
			 }
			 private static void closeConnection() {
				 if (factory !=null) {
					 factory.close();
					
				}
				 if (manager !=null) {
					 manager.close();
					
				}
				 if (transaction.isActive()) {
					 transaction.rollback();
				 }
					
				}
				 public static void main(String[] args) {
			
			    try {
				 openConnection();
				 transaction.begin();
				 ProductDTO product1=new ProductDTO();
				 product1.setId(1);
				 product1.setName("soap");
				 product1.setPrice(150);
				 product1.setPack_date("17-june-2022");
				 manager.persist(product1);
				 
				 ProductDTO product2=new ProductDTO();
				 product2.setId(2);
				 product2.setName("powder");
				 product2.setPrice(250);
				 product2.setPack_date("27-july-2022");
				 manager.persist(product2);
				 
				 ProductDTO product3=new ProductDTO();
				 product3.setId(3);
				 product3.setName("oil");
				 product3.setPrice(450);
				 product3.setPack_date("17-oct-2022");
				 manager.persist(product3);
				 List<ProductDTO> products=Arrays.asList(product1,product2,product3);
				 
				 CustomerDTO customer1=new CustomerDTO();
				 customer1.setId(1);
				 customer1.setName("Nitesh");
				 customer1.setEmail("nitesh@gmail.com");
				 customer1.setLocation("Nashik");
				 customer1.setContact(858855204);
				 customer1.setProducts(products);
				 manager.persist(customer1);
				 
				 CustomerDTO customer2=new CustomerDTO();
				 customer2.setId(2);
				 customer2.setName("Karan");
				 customer2.setEmail("karan@007gmail.com");
				 customer2.setLocation("Nagpur");
				 customer2.setContact(987654204);
				 customer2.setProducts(products);
				 manager.persist(customer2);
				 
				 CustomerDTO customer3=new CustomerDTO();
				 customer3.setId(3);
				 customer3.setName("Anurag");
				 customer3.setEmail("anurag@gmail.com");
				 customer3.setLocation("Jalna");
				 customer3.setContact(95846145);
				 customer3.setProducts(products);
				 manager.persist(customer3);
				 
				 
				 transaction.commit();
			    
					 
				 }
				
			finally {
//				closeConnection();
			}
		}
		 
	}
       

