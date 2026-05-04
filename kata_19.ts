interface Result {
  validSubscribers: string[],
  invalidCount: number
}

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

function cleanEmails(emailsToClean: string[]): Result {
  let cleanedEmails: string[] = [];
  emailsToClean.forEach((string: string) => cleanedEmails.push(string.toLowerCase().trim()))
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const validEmails = cleanedEmails.filter(email => emailRegex.test(email));
  const validSubscribers = [... new Set(validEmails)]
  const invalidCount = emailsToClean.length - validEmails.length;
  return { validSubscribers, invalidCount };
}

console.log(cleanEmails(emails))