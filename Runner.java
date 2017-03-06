class Runner{

  public static void main(String[] args) {
    Bus bus = new Bus(42, "Canonmills", 28);
    BusStop busStop = new BusStop("Castle Terrace", 24);
    Passenger passenger = new Passenger(); 

    System.out.println("The bus stop location is " + busStop.location());

    //set the number of people joining the queue at the bus stop
    for (int i = 0; i < 28; i++) {
      busStop.joinQueue(passenger);
    }
    System.out.println("There are " + busStop.lengthOfQueue() + " people in the queue.");
    System.out.println("The bus just arrived is the number " + bus.number() + " going to " + bus.destination() + ". There are " + bus.numberOfSeats() + " seats on the bus.");

    System.out.println("There are " + bus.numberOfPassengers() + " passengers on board.");

// lets now join the bus and reduce the queue
    System.out.println("**************");

    int count = bus.numberOfSeats();
    //int queueLength = busStop.lengthOfQueue();
    int numberOfEmptySeats = bus.numberOfSeats() - bus.numberOfPassengers();

    for (int i = 0; i < count; i++) {

      if ((busStop.lengthOfQueue() > 0) &&  (bus.numberOfSeats() - bus.numberOfPassengers() > 0 ) ){
        busStop.getOnBus(passenger);
        bus.picksUp(passenger);

      }
      else
      {
        break;
      }

      System.out.println(" ");
      System.out.println("A person gets on the bus");
      System.out.println("There are " + busStop.lengthOfQueue() + " people in the queue.");
      System.out.println("There are " + bus.numberOfPassengers() + " passengers on board.");
    }


  }

}

