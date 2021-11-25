using System;
using MongoDB.Driver;
//https://www.mongodb.com/blog/post/quick-start-c-sharp-and-mongodb-starting-and-setup
namespace MongoTest
{
    internal class Program
    {
        static void Mongo()
        {
            const string databaseConnection = "mongodb://localhost:27017";
            MongoClient dbClient = new MongoClient(databaseConnection);
            var dbList = dbClient.ListDatabases().ToList();
            /*
             Below is the equivalent to the var key word
            System.Collections.Generic.List<MongoDB.Bson.BsonDocument> bsonDocuments = dbClient.ListDatabases().ToList();
            var dbList = bsonDocuments;
            */
            Console.WriteLine("Amount of Mongo Databases: " + dbList.Count);
            Console.WriteLine("The list of databases on this server is: ");
            foreach (var db in dbList)
            {
                Console.WriteLine(db);
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Listing MongoDB Information: ");
            Mongo();
        }
    }
}
