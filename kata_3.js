let bdd = [
    { name: "Stylo", stock: 10 },
    { name: "Livre", stock: 3 },
    { name: "Clavier", stock: 0 }
]


function stockStatus(products) {
    let result = []
    products.forEach((elt) => {
        let nvElt = elt
        if (elt.stock == 0 ) {
            Object.defineProperty(nvElt, "status", {value: "out"})
        } else if (elt.stock < 5 ) {
            Object.defineProperty(nvElt, "status", {value: "low"})
        } else {
            Object.defineProperty(nvElt, "status", {value: "ok"})
        }
        result.push(nvElt)
    })
    return result
}

console.log(stockStatus(bdd))