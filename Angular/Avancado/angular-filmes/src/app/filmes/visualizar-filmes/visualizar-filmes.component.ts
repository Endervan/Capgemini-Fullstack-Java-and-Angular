import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {FilmesService} from '../../core/filmes.service';
import {Filme} from '../../shared/models/filme';
import {Alerta} from '../../shared/models/alerta';
import {AlertaComponent} from '../../shared/components/campos/alerta/alerta.component';
import {MatDialog} from '@angular/material';

@Component({
  selector: 'app-visualizar-filmes',
  templateUrl: './visualizar-filmes.component.html',
  styleUrls: ['./visualizar-filmes.component.scss']
})
export class VisualizarFilmesComponent implements OnInit {
  // foto padrao caso nao exista
  readonly semFoto = 'https://www.termoparts.com.br/wp-content/uploads/2017/10/no-image.jpg';

  filme: Filme;
  id: number;

  constructor(public dialog: MatDialog,
              private activedRouter: ActivatedRoute,
              private filmesService: FilmesService,
              public router: Router) {
  }

  ngOnInit() {
    this.id = this.activedRouter.snapshot.params['id'];
    this.visualizar();
  }

  // Excluir filme
  excluir() {
    const config = {
      data: {
        titulo: 'Tei Certeza que Deseja  Excluir',
        descricao: 'Caso Queira excluir click no botão OK!',
        corBntCancelar: 'primary',
        corBntSucesso: 'warn',
        possuirBtnFechar: true
      } as Alerta
    };
    const dialogRef = this.dialog.open(AlertaComponent, config);

    // acoes depis que fecha modal
    dialogRef.afterClosed().subscribe((opcao: boolean) => {
      if (opcao) {
        this.filmesService.excluir(this.id).subscribe(() => {
          this.router.navigateByUrl('filmes');
        });
      }
    });
  }

  // Editar filme
  editar() {
    this.router.navigateByUrl('filmes/cadastro/' + this.id);
  }

  private visualizar(): void {
    this.filmesService.visualizar(this.id).subscribe((filme: Filme) => this.filme = filme);
  }
}
