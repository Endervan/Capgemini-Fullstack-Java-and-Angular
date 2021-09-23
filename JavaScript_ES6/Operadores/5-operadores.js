// AND logico (&&)
exp1 && exp2

var a1 = true && true; //  retorna true
var a2 = true && false; //  retorna false
var a3 = false && true; //  retorna false
var a4 = false && (3 == 4); //  retorna false
var a5 = "gato" && "caes"; //  retorna gato
var a6 = false && "gato"; //  retorna false
var a7 = "gato" && false; //  retorna false


// OU logico (||)
exp1 || exp2

var a1 = true || true; //  retorna true
var a2 = true || false; //  retorna true
var a3 = false || true; //  retorna true
var a4 = false || (3 == 4); //  retorna false
var a5 = "gato" || "caes"; //  retorna gato
var a6 = false || "gato"; //  retorna gato
var a7 = "gato" || false; //  retorna gato

// NOT logico (!)
exp1 || exp2

var a1 =  !true; //  retorna false
var a2 =  !false; //  retorna true
var a3 =  !true; //  retorna false

