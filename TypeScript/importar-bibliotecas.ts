import $ from 'jquery';


$.fn.extend({
    novaFuncao(){
        console.log('chamou nova funcao');
    }
});

$('body').novaFuncao()