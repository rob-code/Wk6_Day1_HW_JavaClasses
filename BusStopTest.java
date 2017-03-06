import static org.junit.Assert.assertEquals;
import org.junit.*;


public class BusStopTest {
  BusStop busStop;
  Passenger passenger;

  @Before
  public void before() {
    busStop = new BusStop("Castle Terrace", 16);
    passenger = new Passenger();
  }

  @Test
  public void hasLocation(){
    assertEquals("Castle Terrace", busStop.location());
  }

  @Test
  public void lengthOfQueue(){
    assertEquals(0, busStop.lengthOfQueue());
  }


  @Test
  public void isQueueTooLong(){
    assertEquals(false, busStop.queueIsTooLong());
  }

  @Test
  public void hasPersonJoinedQueue(){
    for (int i = 0; i < 22; i++) {
      busStop.joinQueue(passenger);
    }
    assertEquals(16, busStop.lengthOfQueue());
  }

  @Test
  public void queueMemberGetsOnBus(){
    for (int i = 0; i < 22; i++) {
      busStop.joinQueue(passenger);
    }

    for (int i = 0; i < 6; i++) {
      busStop.getOnBus(passenger);
    }
    assertEquals(10, busStop.lengthOfQueue());
  }

}



