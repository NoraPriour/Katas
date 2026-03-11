let tableau = [
    { name: "Lina", age: 22, active: true },
    { name: "Sarah", age: 17, active: true },
    { name: "Emma", age: 30, active: false }
]

// function avec boucle
function getActiveAdultBoucle(users) {
    let resultat = []
    users.forEach((elt) => {
        if (elt.age >= 18 && elt.active) {
            resultat.push(elt)
        }
    })
    return resultat
}

console.log(getActiveAdultBoucle(tableau))

// function sans boucle
function getActiveAdult(users) {
    let resultat = users.filter((elt) => elt.age >= 18 && elt.active)
    return resultat
}

console.log(getActiveAdult(tableau))