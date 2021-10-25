import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Filme} from '../shared/models/filme';
import {ConfigParams} from '../shared/models/config-params';
import {ConfigParamsService} from './config-params.service';


const url = 'http://localhost:3000/filmes/';

@Injectable({
  providedIn: 'root'
})


export class FilmesService {

  constructor(private httpClient: HttpClient, private  configService: ConfigParamsService) {
  }

  // salvando filme
  salvar(filme: Filme): Observable<Filme> {
    return this.httpClient.post<Filme>(url, filme);
  }

  // lista todos filme usando tambem pesquisar de acordo documentação desse backend
  // ex:_page,_limit,_sort(id'),_order(desc),q(texto),genero(genero)
  Listar(config: ConfigParams): Observable<Filme[]> {
    const configParams = this.configService.configurarParametros(config);
      // back aceita == http://localhost:3000/filmes/?_page=1&_limit=1&_sort=id&_order=desc&_q=pessoaDigitar&genero=pessoaEscolheuNoSelect
    // para fazer [scrool infinite]
    return this.httpClient.get<Filme[]>(url, {params: configParams});
  }


}




