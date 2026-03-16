const meetings1 = [
  { start: "09:00", end: "09:30" },
  { start: "10:00", end: "11:00" }
];

const meetings2 = [
  { start: "09:00", end: "10:00" },
  { start: "09:45", end: "10:15" }
];

const meetings3 = [
  { start: "13:00", end: "13:30" },
  { start: "13:30", end: "14:00" }
];

// fonction qui convertit une heure (HH:MM) en minutes
function converter(heure) {
  const tab = heure.split(":");
  let h = parseInt(tab[0]) * 60;
  let min = parseInt(tab[1]);
  return h + min;
}

function hasConflict(meetings) {
  //conversion des heures en minutes
  let starts = [];
  let ends = [];
  meetings.forEach((pair) => {
    starts.push(converter(pair.start));
    ends.push(converter(pair.end));
  });
  // vérification si chevauchement
  if (starts[0]<ends[1] && starts[1]<ends[0]) {
    return true;
  } 
  return false;
}

//tests
console.log(hasConflict(meetings1));
console.log(hasConflict(meetings2));
console.log(hasConflict(meetings3));
