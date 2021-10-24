import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {FilmesService} from '../../core/filmes.service';
import {Filme} from '../../shared/models/filme';

@Component({
  selector: 'app-dio-listagem-filmes',
  templateUrl: './listagem-filmes.component.html',
  styleUrls: ['./listagem-filmes.component.scss']
})
export class ListagemFilmesComponent implements OnInit {
  // foto padrao caso nao exista
  readonly semFoto = 'https://www.termoparts.com.br/wp-content/uploads/2017/10/no-image.jpg';


  // variavel pra scroll
  readonly qntPagina = 4; // readonly => nao pode ser alterada
  pagina = 0;
  filmes: Filme[] = [];
  filtrosListagem: FormGroup;
  generos: Array<string>;

  constructor(private filmesService: FilmesService, private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.filtrosListagem = this.fb.group({
      texto: [''],
      genero: ['']
    });
    this.listarFilmes();
    this.generos = ['Ação', 'Aventura', 'Ficção Científica', 'Romance', 'Terror', 'Comédia', 'Drama'];
  }

  // scroll infinito
  onScroll(): void {
    this.listarFilmes();
  }

  private listarFilmes(): void {
    this.pagina++;
    this.filmesService.Listar(this.pagina, this.qntPagina)
      .subscribe((filmes: Filme[]) => this.filmes.push(...filmes));
  }
}
