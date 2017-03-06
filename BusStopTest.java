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
    assertEquals(16, busStop.lengthOfQueue());
  }

@Test
public void personGetsOnBus(){
busStop.personGetsOnBus();
assertEquals(15, busStop.lengthOfQueue());

}




}



