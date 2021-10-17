interface IUsuario {
    id: String;
    email: String
}

interface IAdmin extends IUsuario {
    cargo: 'gerente' | 'coordenador' | 'supervisor';
}

function redicione(usuario: IUsuario | IAdmin) {
    if ('cargo' in usuario) {
        // redirecionar area de admin
    }

// redionar para area de usuario
}