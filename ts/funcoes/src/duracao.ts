export function duracao(seg: number): string {
  const resto: number = seg % 3600;
  return `${(seg / 3600).toFixed(0)}:${(resto / 60).toFixed(0)}:${(resto % 60).toFixed(0)}`;  
}