package carDemo;

    public class Car extends Vehicle{
//@Override
//public void start() {
//    // TODO Auto-generated method stub
//    super.start();
//}

        public void start() {   // early binding
            // TODO Auto-generated method stub
            System.out.println("car has been started");
        }
        public static void stop() { // late binding
            // TODO Auto-generated method stub
            System.out.println("Car has been stopped");
        }


}
