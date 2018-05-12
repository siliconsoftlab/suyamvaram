package com.slilicon.suyamvarm;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

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

	@Override
	public MongoClient mongoClient() {
		 return new MongoClient("127.0.0.1", 27017);
	}
}