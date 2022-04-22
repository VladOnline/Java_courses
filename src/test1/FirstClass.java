package test1;

public class FirstClass {
    public static void main(String[] args) {

        Storage storage = TestS.storage;
        storage.counter = 1;
        storage.Print();

//        Storage storage = new Storage();
//        storage.counter = 1;
//        storage.Print();
        Second second = new Second();
    }
}
