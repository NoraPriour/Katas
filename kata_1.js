const panier = [{ name: "bananas", price: 1.2, quantity: 3 }, { name: "apples", price: 0.9, quantity: 8 }, { name: "bread", price: 1.8, quantity: 1 }]

console.log(panier[0].name)

function calculateTotal(cart) {
    let total = 0
    for (let i = 0; i < cart.length; i++) {
        if (panier[i].quantity >= 5) {
        total += panier[i].price * panier[i].quantity * 0.9
        } else {
        total += panier[i].price * panier[i].quantity
        }
    }
    return(total.toFixed(2))
}

console.log(calculateTotal(panier))