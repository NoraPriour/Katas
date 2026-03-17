const words = [
    " Java ",
    "java",
    "JAVA",
    "java!",
    "java,",
    "Java.",
    " JavaScript ",
    "javascript",
    "JAVASCRIPT",
    "javascript?",
    " javascript! ",
    " SQL",
    "sql",
    "Sql",
    "SQL!",
    " sql? ",
    "sql,",
    "sql.",
    "Docker",
    "docker",
    "DOCKER!",
    " Git ",
    "git",
    "GIT",
    "git?",
    "git!",
    "React",
    "react",
    "REACT!",
    "react?",
    "Spring",
    "spring",
    "",
    "   ",
    null,
    "   sql   ",
    "JavaScript,",
    "React.",
    "Git,",
    "??",
    "!",
    "."
];


function normalize(cdc) {
    let normalized = cdc.trim().toLowerCase();
    if (normalized[normalized.length - 1] === "." || normalized[normalized.length - 1] === "," || normalized[normalized.length - 1] === "!" || normalized[normalized.length - 1] === "?") {
        normalized = normalized.substring(0, normalized.length - 1);
    }
    return normalized;
}

function findBiggestOccurence (list) {
    let valueOfBiggestOccurence = Math.max(...Object.values(list));
    for (let elt in list) {
        if (list[elt] === valueOfBiggestOccurence) {
            return elt;
        }
    }
}

function countWords(list) {
    let numberOfOccurences = {};
    let listOfWords = [];
    list.forEach((word) => {
        if (word != null && normalize(word) != "") {
           listOfWords.push(normalize(word));
           if (!numberOfOccurences[normalize(word)]) {
            numberOfOccurences[normalize(word)] = 1;
           } else {
            numberOfOccurences[normalize(word)] += 1;
           }
        }
    })
    let result = {"nombre d'occurence de chaque mot:" : numberOfOccurences,
        "nombre de mots valides" : listOfWords.length,
        "mot le plus fréquent" : findBiggestOccurence (numberOfOccurences),
        "nombre de mots distincts" : Object.keys(numberOfOccurences).length,
    };
    return result;
}

console.log(countWords(words));