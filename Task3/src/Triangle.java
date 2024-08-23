public class Triangle implements Shape{

        @Override
        public void draw() {
            System.out.println("Triangle:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


}
