const events = [
    { id: 1, title: "Workshop JS", capacity: 5, booked: 3 },
    { id: 2, title: "React Intro", capacity: 10, booked: 10 },
    { id: 3, title: "SQL Basics", capacity: 8, booked: 0 }
];

function bookSeats(events, eventId, seats) {
    const event = events.find(item => item.id === eventId) // récupération de l'event grâce à son id
    //initialisation résultat
    let resultat = {
        success: true,
        message: "",
        remainingSeats: 0
    }
    //vérification de l'existence de l'event
    if (event == undefined) {
        resultat.success = false
        resultat.message = "Event not found"
        resultat.remainingSeats = 0
        return resultat
    }
    //vérification qu'au moins 1 siège soit demandé dans la réservation
    if (seats <= 0 ) {
        resultat.success = false
        resultat.message = "You need to book at least one seat"
        resultat.remainingSeats = event.capacity - event.booked
        return resultat
    }
    //vérification que le nombre de sièges à réserver ne dépasse pas le nb de places disponibles
    if (event.capacity - event.booked - seats <0) {
        resultat.success = false
        resultat.message = "Not enough capacity"
        resultat.remainingSeats = 0
        return resultat
    }
    // incrémentation du nombre de siège disponible
    event.bookSeats +=seats
    resultat.remainingSeats = event.capacity - event.booked - seats
    return resultat
}

console.log(bookSeats(events, 1, 2), bookSeats(events, 2, 1), bookSeats(events, 99, 1))