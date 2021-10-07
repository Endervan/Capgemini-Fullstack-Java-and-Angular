// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

const operacao = gets();

const isSum = operacao === "S";



const xL = 12, yL = 12;

let sum = 0.0, av = 0.0;



let linha = gets();



if (linha.length > 5) {

   for (var y = 0; y < yL; y++) {



    if (y != 0) {

      linha = gets();

    }

    let numeros = linha.trim().split(/[\s,]+/);



    for (var x = 0; x < xL; x++) {



      if ((y > 6) && (x < y) && (x > 11 - y)) {

        var valor = Number(numeros[x]);

        sum += valor;

        ++av;

      }

    }

  }

}

else {



  var contagem = 1;

  for (var y = 0; y < yL; y++) {



    for (var x = 0; x < xL; x++) {



      var valor = 0;



      if (contagem == 1) {

        valor = Number(linha);

        primeiroloop = false;

      }

      else {

        linha = gets().trim();

        valor = Number(linha);

      }



      if ((y > 6) && (x < y) && (x > 11 - y)) {

        sum += valor;

        ++av;

      }



      contagem++

    }

  }

}



console.log((sum / (isSum ? 1 : av)).toFixed("1"));

