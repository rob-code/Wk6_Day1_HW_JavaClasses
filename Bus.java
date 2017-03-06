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
    //return this.numberOfSeats;
    System.out.println("number of seats is = " + this.seats.length);
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

// public void picksUp(Passenger passenger){
//   if ( isBellyFull() ) {
//     return;
//   }
//   int index = foodCount();
//   belly[index] = salmon; 


// }






}


