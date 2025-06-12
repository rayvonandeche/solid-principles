// Dependency Inversion Principle (DIP)
// High-level modules should not depend on low-level modules directly.
// In this example the databse can be swaaped without modifiying thr Application

interface Database {
  void connect();
}

class  MySqlDatabase implements Database {
  public  void connect(){
    System.out.println("Connecting to MySQL Database...");
  }
}

class MongoDatabase implements Database {
  public void connect(){
    System.out.println("Connecting to MongoDB..");
  }
}

class Application{
  private Database database;
  
  Application(Database database){
  this.database = database;
  }
  
  void run(){
    database.connect();
  }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        // Using MySqlDatabase
        Database mysql = new MySqlDatabase();
        Application app1 = new Application(mysql);
        app1.run();

        // Using MongoDatabase
        Database mongo = new MongoDatabase();
        Application app2 = new Application(mongo);
        app2.run();
    }
}
