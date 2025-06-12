// Interface Segregation Principle
// Interfaces should be specific rather than doing many diffrent things
// Larger interfaces should be decomposed to smaller ones
//Violating Isp
public interface Machine {
    void print();
    void scan();
    void fax();
}

public class OldPrinter implements Machine {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}

//Adherence
public interface Printer {
    void print();
}

public interface Scanner {
    void scan();
}

public interface Fax {
    void fax();
}
public class OldPrinter implements Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class AllInOnePrinter implements Printer, Scanner, Fax {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void fax() {
        System.out.println("Faxing document...");
    }
}
