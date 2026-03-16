const emails = [
  "lina@mail.com",
  "sarahmail.com",
  "aline@site",
  "morad @mail.com",
  "lucie@domain.fr",
  "paulette@mail .com",
  "contact@entreprise.org"
];

function getValidEmails(emails) {
  let result = [];
  emails.forEach((email) => {
    if (email.includes("@") && email.includes(".") && !email.includes(" ")) {
      result.push(email);
    }
  });
  return result;
}

console.log(getValidEmails(emails));
