// Parser une commande type CLI

const commands = [
    "add title=LearnJS priority=high",
    "add title=WriteDocs priority=low",
    "remove id=42",
    "add title=FixBug",
    "remove",
    "add title=Hello priority=medium"
];

function splitCommande(listeCommandes) {
    let resultat = []
    // parcours de chaque elt du tableau
    for (let i = 0; i < listeCommandes.length; i++) {
        // on vérifie que l'elt n'est pas vide
        if (listeCommandes[i] == "") {
            resultat.push({ action: "unknown", params: {} })
        } 
        else {
            let commande = listeCommandes[i].split(" ") // on découpe l'elt à chaque espace
            // on vérifie que le premier mot est "add" ou "remove"
            let action = commande[0]
            if (action != "add" && action != "remove") {
                action = "unknown"
            }
            let params = []
            // parcours des parametres 
            for (let i = 1; i < commande.length; i++) {
                // découpage du paramètre à chaque "="
                if (commande[i].includes("=")) {
                    let parametre = commande[i].split("=");
                    params.push({ [parametre[0]]: parametre[1] })
                }
            }
            // ajout de action et de params au résultat
            resultat.push({ action: action, params: params })
        }
    }
    return resultat
}

console.log(splitCommande(commands))