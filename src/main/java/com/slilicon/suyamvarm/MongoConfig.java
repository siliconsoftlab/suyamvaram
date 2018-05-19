package com.slilicon.suyamvarm;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "suyamvaram";
    }
  
  
    @Override
    protected String getMappingBasePackage() {
        return "com.slilicon.suyamvarm";
    }

	@SuppressWarnings("deprecation")
	@Override
	 @Bean
	public MongoClient mongoClient() {
		// return new MongoClient("127.0.0.1", 27017);
		//return new MongoClient("52.77.220.7", 27017);
		 return new MongoClient(Collections.singletonList(new ServerAddress("127.0.0.1", 27017)),
				 Collections.singletonList(MongoCredential.createCredential("saravanan", "suyamvaram", "Ambika@89".toCharArray())));
		
	}
}