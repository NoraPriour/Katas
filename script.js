const events = [
    { id: 1, title: "Workshop JS", capacity: 5, booked: 3 },
    { id: 2, title: "React Intro", capacity: 10, booked: 10 },
    { id: 3, title: "SQL Basics", capacity: 8, booked: 0 }
];

function bookSeats(events, eventId, seats) {
    const event = events.find(item => item.id === eventId)
    let resultat = {
        success: true,
        message: "",
        remainingSeats: 0
    }
    if (event == undefined) {
        resultat.success = false
        resultat.message = "Event not found"
        resultat.remainingSeats = 0
        return resultat
    }
    if (seats <= 0 ) {
        resultat.success = false
        resultat.message = "You need to book at least one seat"
        resultat.remainingSeats = event.capacity - event.booked - seats
        return resultat
    }
    if (event.capacity - event.booked - seats <0) {
        resultat.success = false
        resultat.message = "Not enough capacity"
        resultat.remainingSeats = 0
        return resultat
    }
    event.bookSeats +=seats
    resultat.remainingSeats = event.capacity - event.booked - seats
    return resultat
}

console.log(bookSeats(events, 1, 2), bookSeats(events, 2, 1), bookSeats(events, 99, 1))