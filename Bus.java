public class Bus{

  private int number;
  private String destination;
  private int numberOfSeats;
  private Passenger[] seats;

  public Bus(int number, String destination, int numberOfSeats){
    this.number = number;
    this.destination = destination;
    this.numberOfSeats = numberOfSeats;
    this.seats = new Passenger[this.numberOfSeats];
  }

  public int number(){
    return this.number;
  }

  public String destination(){
    return this.destination;
  }

  public int numberOfSeats(){
    return seats.length;
  }

  public int numberOfPassengers(){
    int count = 0;
    for (Passenger passenger : seats) {
      if (passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return numberOfPassengers() == seats.length;
  }

  public void picksUp(Passenger passenger){
    if ( isBusFull() ) {
      return;
    }
    int index = numberOfPassengers();
    this.seats[index] = passenger; 
  }

  public void dropsOff(Passenger passenger){
    if (numberOfPassengers() == 0) {
      return;
    }
    int index = numberOfPassengers();
    System.out.println("index is = " + index);
    this.seats[index-1] = null;
  }




}



