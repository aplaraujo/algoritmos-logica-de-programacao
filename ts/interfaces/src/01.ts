function convertToTimestamp(dateStr: string): number {
  // Divide a string em data e hora
  const [datePart, timePart] = dateStr.split(' ');

  // Divide os componentes da data
  const [day, month, year] = datePart.split('/').map(Number);

  // Divide os componentes da hora
  const [hours, minutes, seconds] = timePart.split(':').map(Number);

  // Lembre-se: meses em JavaScript começam em 0 (janeiro = 0)
  const date = new Date(year, month - 1, day, hours, minutes, seconds);

  // Retorna o timestamp (milissegundos desde 1/1/1970 UTC)
  return date.getTime();
}

const dateString = '25/06/2018 10:30:00';
console.log(convertToTimestamp(dateString))

const timestamp2 = convertToTimestamp(dateString);
const date2 = new Date(timestamp2 * 1000);
const hours = date2.getHours();
console.log(hours);