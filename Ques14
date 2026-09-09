package Java_OOPS_Program;

class Storage {
    private int value;

    synchronized void setValue(int value) {
        this.value = value;
        notify();
    }

    synchronized int getValue() {
        return value;
    }
}

class Counter extends Thread {
    private Storage storage;

    Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 0; i <= 20; i++) {
            storage.setValue(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Printer extends Thread {
    private Storage storage;

    Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 0; i <= 20; i++) {
            synchronized (storage) {
                try {
                    storage.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Value = " + storage.getValue());
            }
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        printer.start();
        counter.start();
    }
}
