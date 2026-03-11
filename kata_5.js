let commandes = [
  { user: "Lina", amount: 20 },
  { user: "Lina", amount: 15 },
  { user: "Sarah", amount: 30 }
]

let commandes2 = [
  { user: "Lina", amount: 20 },
  { user: "Lina", amount: 15 },
  { user: "Sarah", amount: 30 },
  { user: "Tom", amount: 10 },
  { user: "Lina", amount: 25 },
  { user: "Sarah", amount: 40 },
  { user: "Tom", amount: 5 },
  { user: "Alice", amount: 50 },
  { user: "Bob", amount: 20 },
  { user: "Alice", amount: 10 }
];

function totalByUser(orders) {
    let res = []
    res[0]=orders[0]
    for (let i=1; i<orders.length; i++) {
        if (res.some(item => item.user === orders[i].user)) {
            let index = res.findIndex(item => item.user === orders[i].user)
            res[index].amount += orders[i].amount
            res.push({user: "toDelete"})
        } else {
            res.push(orders[i])
        }
    }

    return res.filter(item => item.user !== "toDelete")
}

console.log(totalByUser(commandes))
console.log(totalByUser(commandes2))