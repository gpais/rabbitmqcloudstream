package com.mycompany.myapp;

import java.net.InetAddress;
//import util.properties packages
import java.util.Properties;

////import simple producer packages
//import org.apache.kafka.clients.producer.Producer;
//
////import KafkaProducer packages
//import org.apache.kafka.clients.producer.KafkaProducer;
//
////import ProducerRecord packages
//import org.apache.kafka.clients.producer.ProducerRecord;

//Create java class named “SimpleProducer”

public class SimpleProducer {
//
//	   public static void main(String[] args) throws Exception{
//		    String principalName = "alice";
//	        System.setProperty("java.security.auth.login.config", "C:/kafka_client_jaas_alice.conf");
////	        System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
//
//	      
//	      //Assign topicName to string variable
//	      String topicName = "test";
//	      
//	      // create instance for properties to access producer configs   
//	      Properties props = new Properties();
//	      //Assign localhost idbroker-list localhost:9092 
//	      props.put("bootstrap.servers", "192.168.99.100:9092");
//	      props.put("broker-list", "192.168.99.100:9092");
//	      props.put("security.protocol", "SASL_PLAINTEXT");
//	      props.put("sasl.mechanism", "PLAIN");
//	      props.put("java.security.auth.login.config", "C:/kafka_client_jaas_alice.conf");
//	      props.put("security.inter.broker.protocol", "PLAIN");
//	      props.put("sasl.mechanism.inter.broker.protocol", "PLAIN");
//	      props.put("sasl.enabled.mechanisms", "PLAIN");
//	      props.put("zookeeper.connect", "192.168.99.100:2181");
////	    		  authorizer.class.name=kafka.security.auth.SimpleAclAuthorizer
////	      -Djava.security.auth.login.config=C:/kafka_client_jaas_alice.conf -Djavax.security.auth.useSubjectCredsOnly=true
//
//	      //Set acknowledgements for producer requests.      
//	      props.put("acks", "all");
//	      
//	      //If the request fails, the producer can automatically retry,
//	      props.put("retries", 0);
//	      
//	      //Specify buffer size in config
//	      props.put("batch.size", 16384);
//	      
//	      //Reduce the no of requests less than 0   
//	      props.put("linger.ms", 1);
//	      
//	      //The buffer.memory controls the total amount of memory available to the producer for buffering.   
//	      props.put("buffer.memory", 33554432);
//	      
//	      props.put("key.serializer", 
//	         "org.apache.kafka.common.serialization.StringSerializer");
//	         
//	      props.put("value.serializer", 
//	         "org.apache.kafka.common.serialization.StringSerializer");
//	      
//	      Producer<String, String> producer = new KafkaProducer
//	         <String, String>(props);
//	            
//	      for(int i = 0; i < 10; i++)
//	         producer.send(new ProducerRecord<String, String>(topicName, 
//	            Integer.toString(i), Integer.toString(i)));
//	               System.out.println("Message sent successfully");
//	               producer.close();
//	   }
}
