class Theater {
  private var freeSeats: Int = 100

  def getFreeSeats: Int = freeSeats

  protected def sellTickets(tickets: Int): Int = {
    if (freeSeats >= tickets) {
      freeSeats -= tickets
      tickets
    } else 0
  }
}

class TheaterOffice extends Theater {
  def sellTicketToPublic(tickets: Int): Int = {
    //...
    sellTickets(tickets)
    //...
  }
}

val theater = new TheaterOffice

theater.getFreeSeats
theater.sellTicketToPublic(3)
theater.getFreeSeats
theater.sellTicketToPublic(3)
theater.getFreeSeats
