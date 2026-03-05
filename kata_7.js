const actions = [
    { type: "win", points: 10 },
    { type: "bonus", points: 5 },
    { type: "penalty", points: 3 },
    { type: "win", points: 20 },
    { type: "penalty", points: 2 }
];

function calculateScore(actions) {
    let score = 0
    actions.forEach((entree) => {
        if (entree.type == "win" || entree.type == "bonus") {
            score += entree.points
        } else {
            score -= entree.points
        }
    })
    if (score < 0) {
        score = 0
    }
    return score
}


console.log(calculateScore(actions))