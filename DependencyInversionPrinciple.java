// Dependency Inversion Principle (DIP)
// High-level modules should not depend on low-level modules directly.
// In this example the databse can be swaaped without modifiying thr Application

interface Database {
  void connect()
}

class  MySqlDatabase implements Database {
  public  void connect(){
    System.out.println("Connecting to MySQL Database...");
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
