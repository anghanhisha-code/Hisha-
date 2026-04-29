// Shared class with synchronized method
class TablePrinter {

    // Synchronized method ensures one thread prints fully at a time
    public synchronized void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

            try {
                Thread.sleep(200); // small delay for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("----------------------");
    }
}

// Thread for table 5
class Table5 extends Thread {
    TablePrinter tp;

    Table5(TablePrinter tp) {
        this.tp = tp;
    }

    public void run() {
        tp.printTable(5);
    }
}

// Thread for table 7
class Table7 extends Thread {
    TablePrinter tp;

    Table7(TablePrinter tp) {
        this.tp = tp;
    }

    public void run() {
        tp.printTable(7);
    }
}

// Main class
public class SyncTableTest {
    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        Table5 t1 = new Table5(printer);
        Table7 t2 = new Table7(printer);

        t1.start();
        t2.start();
    }
}
