const emails = [
  " Lina@mail.com ",
  "sarah@mail.com",
  "SARAH@mail.com",
  "badmail.com",
  "noa @mail.com",
  "contact@site.fr",
  "CONTACT@site.fr ",
  "",
  "   "
];

function cleanEmails(emailsToClean : string[]) : string[] {
    let cleanedEmails: string[] = [];
    emailsToClean.forEach((string: string) => cleanedEmails.push(string.toLowerCase().trim()))
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const validEmails = cleanedEmails.filter(email => emailRegex.test(email));
    return [... new Set(validEmails)];
}

console.log(cleanEmails(emails))