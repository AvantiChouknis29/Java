
//Java dont provide destructor(for manual removal of unreferenced var,obj)
//But it has a concept of auto destruction(Garbage collection)
//finalize method will be called when java is doing garbage collection and whatever u wrote
//in that method will be executed


class MyResource {
    // Constructor
    MyResource() {
        System.out.println("Resource created");
    }

    // Finalize method for cleanup
    protected void finalize() {
        System.out.println("Resource finalized");
        // Perform cleanup actions here
    }



    public static void main(String[] args) {
        MyResource resource1 = new MyResource();
        MyResource resource2 = new MyResource();

        // Assign null to make the objects eligible for garbage collection
        resource1 = null;
        resource2 = null;

        // Request garbage collection
        System.gc();

        // Note: System.gc() is a request to the JVM for garbage collection.
        // It doesn't guarantee immediate garbage collection.
    }
}

