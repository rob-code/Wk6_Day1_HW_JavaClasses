class BusStop{

  private String location;
  private Passenger[] people;

  public BusStop(String location){
    this.location = location;
    this.people = new Passenger[15];
  }

  public String location(){
    return this.location;
  }



  // public int lengthOfQueue(){
  //   return people.length;
  // } no...thats wrong as the people in the queue will queue up tosome maximum and will stop when it reches an uaceptable level




    int count = 0;
    for (Passenger passenger : seats) {
      if (passenger != null){
        count++;
      }
    }
    return count;
  }


public void personGetsOnBus(){
if (lengthOfQueue == 0) {
  return;
}
int index = lengthOfQueue();
people[index] = null;


}









}