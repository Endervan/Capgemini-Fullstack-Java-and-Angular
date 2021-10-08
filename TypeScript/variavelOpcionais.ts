interface IUsauario {
    id: string;
    email: string;
    cargo?: 'gerente' | 'coordenador' | 'supervisor' | 'funcionario';
}

function redirecione(usuario: IUsauario) {
    if (usuario.cargo) {
        //redireciona
    }

    // redirecionar para area do usuario
}