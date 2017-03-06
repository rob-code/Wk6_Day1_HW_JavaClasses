import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;

  @Before
  public void before() {
    bus = new Bus(42, "Canonmills", 80);
    passenger = new Passenger();
  }

  @Test
  public void hasRoute(){
    assertEquals(42, bus.number());
  }

  @Test
  public void hasDestination(){
    assertEquals("Canonmills", bus.destination());
  }

  @Test
  public void hasCapacity(){
    assertEquals(80, bus.numberOfSeats());
  }

  @Test
  public void numberOfPassengersAtStart(){
    assertEquals(0, bus.numberOfPassengers());
  }

  @Test
  public void isBusFullAtStart(){
    assertEquals(false, bus.isBusFull());
  }


@Test
public void picksUpPassenger(){
  for (int i = 0; i < 20; i++) {
    bus.picksUp(passenger);
  }
  assertEquals(20, bus.numberOfPassengers());
}


}
