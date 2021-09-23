const users = ['Ender', 'pedro', 'Jennifer'];

const gender = {
    MAN: Symbol('M'),
    WOMAN: Symbol('W'),
}

const persons = [
    {
        name: 'Ender',
        age: 26,
        gender: gender.MAN
    },
    {
        name: 'Pedro',
        age: 43,
        gender: gender.MAN
    },
    {
        name: 'Jennifer',
        age: 18,
        gender: gender.WOMAN
    }
];

// retorna quantidade  de itens  de um array
// console.log('Items ',persons.length)
//
// //verificar se e uma array
// console.log(`A variavel  persons e um array`,  Array.isArray(persons));
//
// // Interar os items do array
// persons.forEach((person,index,arr)=>{
//     console.log(`Nome ${person.name} index: ${index}`,arr);
// })

//filtar um array
const mens = persons.filter(person => person.gender === gender.MAN);
console.log(`Quantidade de Homens da lista e `, mens);

// RETORNA UM NOVO ARRAY
const personsWithCourse = persons.map(person => {
    person.course = 'Introdução a javaScript';
    return person
})
console.log('\n Pessoas coma adicção de course ',personsWithCourse);

// Transforma um array em outro tipo
const totalAge = persons.reduce((age,person)=>{
    age += person.age;
    return age
},0);

console.log('\n Soma de Idade das persoas ', totalAge);

// juntando operações
const totalEvenAges = persons
.filter(person=>person.age % 2 ===0)
.reduce((age,person)=>{
    age += person.age;
    return age
},0);

console.log('\n Somas de todas as idades das pessoas que possuem idade par ::: ',totalEvenAges);