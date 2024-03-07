class vehicle {
     void drive(){
          System.out.println("Repairing a vehicle");
      }
}

class car extends vehicle {
    //@override
    void drive(){
        System.out.println("Repairing a car");
    }
}

public class problem7 {
    public static void main(String args[]){
        vehicle veh = new vehicle();
        car c = new car();
        c.drive();
        c.drive();

    }

}
