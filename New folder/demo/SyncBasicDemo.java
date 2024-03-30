package demo;

import org.bson.Document;

import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import utils.DBConnection;

public class SyncBasicDemo {

	public static void main(String[] args) {
		DBConnection conn = new DBConnection();
		MongoClient client = conn.getClient();

//		// show dbs
//		client.listDatabaseNames().forEach(dbName -> {
//			System.out.println(dbName);
//
//			MongoDatabase db = client.getDatabase(dbName);
//
//			// show collections
//			db.listCollectionNames().forEach(collName -> {
//				System.out.println("\t\t" + collName);
//
//				// get collection
//				MongoCollection<Document> coll = db.getCollection(collName);
//				coll.listIndexes().forEach(index -> {
//					System.out.println("\t\t" + index);
//				});
//			});
//		});
		
		// Get specific database
		MongoDatabase database = conn.getDatabase();
		// Get all collections
		MongoIterable<String> collectionNames = database.listCollectionNames();
		collectionNames.iterator().forEachRemaining(c -> { System.out.println(c); });

		ListCollectionsIterable<Document> collections = database.listCollections();
		collections.iterator().forEachRemaining(col -> { System.out.println(col.get("name")); });
		
		
	}

}
