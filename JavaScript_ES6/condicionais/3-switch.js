//
//
// switch (expressao){
//     case:valor1;
//     break;
//     case:valor2;
//     break;
//
//     default;
//     break;
// }

const fruit = 'pera';

switch (fruit) {
    case 'banana':
        console.log('R$ 3,00/kg')
        break;
    case "pera":
    case'mamão':
        console.log('R$ 2,00/kg')
        break;
    default:
        console.log('produto nao existe no estoque');

}
