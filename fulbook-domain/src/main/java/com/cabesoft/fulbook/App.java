package com.cabesoft.fulbook;

import java.net.UnknownHostException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cabesoft.fulbook.domain.model.dto.PlayerDTO;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
    	MongoClient mongo = (MongoClient) context.getBean("mongo");
//    	MongoClient mongo = new MongoClient( "localhost" , 27017 );
    	DB fulbook=mongo.getDB("fulbook");
    	DBCollection players= fulbook.getCollection("fulbook.players");
    	BasicDBObject searchQuery = new BasicDBObject();
    	searchQuery.put("name", "messi");
    	DBObject messi = players.findOne(searchQuery);
    
    	
    	
//    	PlayerDTO messiDTO=  gson.fromJson(messi.toString(),PlayerDTO.class);
//    	System.out.println(messiDTO);
    	}
}
