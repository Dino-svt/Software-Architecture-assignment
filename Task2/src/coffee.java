 class Coffee extends Beverages {

    @Override
     void brew(){
        System.out.println("Dripping coffee..");
    }

    @Override
     void addCondiments(){
        System.out.println("Adding sugar and cream..");
    }
    @Override
     void addExtras(){
        System.out.println("Adding whipped cream..");
    }


}
