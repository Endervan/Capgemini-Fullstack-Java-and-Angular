const isSum = lines.shift() === "S";

const xL = 12,
    yL = 12;

let sum = 0.0,
    av = 0.0;

for (                   ) {
    for (                  ) {
        const i = Number(lines.shift());

        if (                    ) {
            sum += i;
            ++av;
        }
    }
}

console.log((sum / (isSum ? 1 : av)).toFixed("1"));