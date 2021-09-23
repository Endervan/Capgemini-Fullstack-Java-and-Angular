// in

somenthing in somenthingItens

// Arrays
var arvores = new  Array("pau-brasil","loureiro","cedro","carvalho","sicomoro");
0 in arvores; // .................retorna true
3 in arvores; // .................retorna true
6 in arvores; // .................retorna false

"cedro" in arvores // ...............retorna false(deveespecifica o indice) // nao valor daquele indice
"length" in arvores // ...............retorna true (length e uma propriedade array)

// objetos pre definitos
"PI" in Math;//....................retorna true
var minhaString = new  String("coral");
"length" in arvores // ...............retorna true

// Objetos predefinidos
var meuCarro = {marca:"Honda",modelo:"Accord",ano:1990};
"marca" in arvores // ...............retorna true
"modelo" in arvores // ...............retorna true

// instaceof
objeto instanceof tipoObjeto;

var dia = new Date(2018,12,12);
if(dia instanceof Date){
    // code here ....
}

