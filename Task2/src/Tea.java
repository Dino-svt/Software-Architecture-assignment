class Tea extends Beverages {


    @Override
    void brew(){
        System.out.println("Steeping tea leaves..");

    }
    @Override
    void addCondiments(){
        System.out.println("Adding sugar and milk...");
    }

    @Override
    void addExtras(){
        System.out.println("Adding lemon slice..");
    }
}
