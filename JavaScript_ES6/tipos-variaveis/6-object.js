// let user ={
//     name:'ender',
//     lastname:'alves da cruz'
// };



// alterando a propriedade de um objeto
// user.name = 'outro nome 1';
//
// user['name'] = 'outro nome 2';
//
// //console.log(user);
//
// const prop = 'name';
// user[prop] = 'outro nome 3';

//console.log(user);
//
//
// //criando uma propriedade
// user.lastName = 'alves da cruz';
//
// //deletando uma propriedade
// delete user.name;

// recuperando  chaves do objeto
// console.log('propriedades do objeto user ',Object.keys(user))
//
// // recuperando valores das chaves do objeto
// console.log('propriedades do objeto user ',Object.values(user))
//
// // retornando array de arrays contendo [nome.prop,valor_prop]
// console.log('propriedades do objeto user ',Object.entries(user));
//
// // mergear propriedades de objetos
// Object.assign(user,{fullName:'ender alves da cruz'})
//
// console.log('\n Adicionar a propriedade full name no objeto user ', user)
// console.log('\n Retorna um novo objeto mergeando dois ou mais objetos ',Object.assign({},user,{age:26}));

// previne todas as alterações em um objeto
// const newObj = {foo:'bar'}
// // Object.freeze(newObj);
//
// newObj.foo = 'changes';
// delete  newObj.foo;
// newObj.bar = 'foo';
// console.log('\n Variavel newObj apos as alterações ',newObj)

// permite apenas a alteração de propriedades existentes em um objeto

const person = {name:'ender'};
Object.seal(person);

person.name = 'ender alves';
delete  person.name;
person.age = 26;


console.log('\n Variavel person apos as ateraões:',person);