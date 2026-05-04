interface Purchase {
    customer: string;
    amount: number;
    category: string;
}

interface Customer {
    name: string;
    points: number;
}

const purchases: Purchase[] = [
    { customer: "Lina", amount: 120, category: "tech" },
    { customer: "Lina", amount: 40, category: "food" },
    { customer: "Noa", amount: 75, category: "tech" },
    { customer: "Sam", amount: 19, category: "books" }
];

function calculateLoyaltyPoints(purchases: Purchase[]): Customer[] {
    let customers: Customer[] = [];
    purchases.forEach((purchase) => {
        if (!customers.some(customer => customer.name === purchase.customer)) {
            customers.push({
                name: purchase.customer,
                points: Math.floor(purchase.amount / 10)
            })
        }
        else {
            const customer: Customer = customers.find(customer => customer.name === purchase.customer)!
            customer.points += Math.floor(purchase.amount / 10)
        }
        if (purchase.category === "tech") {
            const customer: Customer = customers.find(customer => customer.name === purchase.customer)!
            customer.points += 5
        }
    })
    return customers;
}

console.log(calculateLoyaltyPoints(purchases))