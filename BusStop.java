class BusStop{

  private String location;
  private Passenger[] queue;
  private int queueExasperationLength;

  public BusStop(String location, int queueExasperationLength){
    this.location = location;
    this.queueExasperationLength = queueExasperationLength;
    this.queue = new Passenger[this.queueExasperationLength];
  }

  public String location(){
    return this.location;
  }

  public int lengthOfQueue(){
    int count = 0;
    for (Passenger passenger : queue) {
      if (passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean queueIsTooLong(){
    return this.queueExasperationLength == lengthOfQueue(); 
  }

  public void joinQueue(Passenger passenger){
    if (queueIsTooLong()){
      System.out.println("The queue's too long - I'm not waiting, I'm going to walk!");
      return;
    }
    int index = lengthOfQueue();
    this.queue[index] = passenger;
  }

  public void getOnBus(Passenger passenger){
    if (lengthOfQueue() == 0){
      return;
    }
    int index = lengthOfQueue();
    this.queue[index-1] = null;
  }

}