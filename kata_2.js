function surveyStats(answers) {
    let yes = 0;
    let no = 0;
    let maybe = 0;
    let invalid = 0;
    answers.forEach((answer) => {
        if (answer.toLowerCase().trim() == "yes") {
            yes += 1
        } else if (answer.toLowerCase().trim() == "no") {
            no += 1
        } else if (answer.toLowerCase().trim() == "maybe") {
            maybe += 1
        } else {
            invalid += 1
        }
    })
    const res = { "yes": yes, "no": no, "maybe": maybe, "invalid": invalid }
    console.log(res)
}

surveyStats(["yes", "no", "yes", "maybe", "YES", " no "])