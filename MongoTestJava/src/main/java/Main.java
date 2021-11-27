import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/*
https://www.mongodb.com/java
Below removes resolves the logging error per the Mongo documentation
https://docs.mongodb.com/drivers/java/sync/current/fundamentals/logging/
 */

public class Main {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("Java");
        MongoCollection<Document> toys = database.getCollection("Java2");
        //Document toy = new Document("name", "yoyo").append("ages", new Document("min", 5));
        //ObjectId id = toys.insertOne(toy).getInsertedId().asObjectId().getValue();
        //ObjectId toy2 = toys.insertOne(watch2).getInsertedId().asObjectId().getValue();
        Document watch = toys.find(new Document("name", "watch")).first();
        assert watch != null : "watch is null";
        /*
        Throws an exception if the condition is == null
        https://stackoverflow.com/questions/3018683/what-does-the-assert-keyword-do
         */
        System.out.println(watch.toJson());
        toys.find().first();
        System.out.println("Completed IO Operations");
    }
}
