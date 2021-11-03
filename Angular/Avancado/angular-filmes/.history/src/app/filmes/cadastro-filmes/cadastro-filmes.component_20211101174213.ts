import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';

import {ValidarCamposService} from '../../shared/components/campos/validar-campos.service';
import {Filme} from '../../shared/models/filme';
import {FilmesService} from '../../core/filmes.service';
import {AlertaComponent} from '../../shared/components/campos/alerta/alerta.component';
import {Alerta} from '../../shared/models/alerta';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-cadastro-filmes',
  templateUrl: './cadastro-filmes.component.html',
  styleUrls: ['./cadastro-filmes.component.scss']
})
export class CadastroFilmesComponent implements OnInit {

  cadastro: FormGroup;
  cadastro1: any;
  generos: Array<string>;
  // visualizacao objetos no cadastro de um filme editado
  id: number;
  filme: Filme;

  constructor(public validacao: ValidarCamposService,
              public dialog: MatDialog,
              private fb: FormBuilder,
              private filmesService: FilmesService,
              private router: Router,
              private activedRouter: ActivatedRoute) {
  }

  // retorna todos campos
  get f() {
    return this.cadastro.controls;
  }

  ngOnInit() {
    this.id = this.activedRouter.snapshot.params['id'];
    if (this.id) {
      this.filmesService.visualizar(this.id).subscribe((filme: Filme) => this.criarFormulario(filme));
    } else {
      this.criarFormulario(this.criarFilmeEmBranco());
    }
    // populando selects
    this.generos = ['Ação', 'Aventura', 'Ficção Científica', 'Romance', 'Terror', 'Comédia', 'Drama'];

  }

  criarFilmeEmBranco(): Filme {
    return {
      id: null,
      titulo: null,
      dtLancamento: null,
      urlFoto: null,
      descricao: null,
      nota: null,
      urlIMDb: null,
      genero: null,
    } as Filme;
  }


  // salvado filme
  submit(): void {
    this.cadastro.markAllAsTouched();
    if (this.cadastro.invalid) {
      return;
    }
    // getRawValue() as filmes=> garantir retorna todos campos formGroup do cadastro
    const filme = this.cadastro.getRawValue() as Filme;
    if (this.id) {
      filme.id = this.id; // especifica que vai manda tb id na requisição
      console.log(filme.id);
      this.editar(filme);
    } else {
      this.salvar(filme);
    }
    // alert(JSON.stringify(this.cadastro.value, null, 4));
    // alert(JSON.stringify(filme, null, 4));
  }

  reiniciarForm(): void {
    this.cadastro.reset();
  }

  criarFormulario(filme: Filme): void {
    this.cadastro = this.fb.group({
      titulo: [filme.titulo, [Validators.required, Validators.minLength(2), Validators.maxLength(256)]],
      urlFoto: [filme.urlFoto, [Validators.minLength(10)]],
      dtLacamento: [filme.dtLancamento, [Validators.required]],
      descricao: [filme.descricao],
      nota: [filme.nota, [Validators.required, Validators.min(0), Validators.max(10)]],
      urlIMDb: [filme.urlIMDb, [Validators.minLength(10)]],
      genero: [filme.genero, [Validators.required]],
    });
  }

  private salvar(filme: Filme): void {
    this.filmesService.salvar(filme).subscribe(() => {
      const config = {
        data: {
          btnSucesso: 'Ir para Listagem',
          btnCancelar: 'Cadastra Novo Filme',
          corBntCancelar: 'wa',
          possuirBtnFechar: true
        } as Alerta
      };
      const dialogRef = this.dialog.open(AlertaComponent, config);

      // acoes depis que fecha modal
      dialogRef.afterClosed().subscribe((opcao: boolean) => {
        if (opcao) {
          this.router.navigateByUrl('filmes');
        } else {
          // limpa formulario atual
          this.reiniciarForm();
        }
      });
    }, () => {
      const config = {
        data: {
          titulo: 'Erro ao salva o registro ',
          descricao: 'Não Conseguimos Salva seu registro! Favor Tenta Novamente Mais Tarde',
          corBntSucesso: 'wan',
          btnSucesso: 'Fechar',
        } as Alerta
      };
      // mensagens personalizada pra back
      this.dialog.open(AlertaComponent, config);
    });
  }

  private editar(filme: Filme): void {
    this.filmesService.editar(filme).subscribe((result) => {
      console.log(result);
      const config = {
        data: {
          titulo: 'Registro Atualizado com sucesso',
          descricao: 'Seu Registro foi Atualizado com sucesso',
          btnSucesso: 'Ir para Listagem',
        } as Alerta
      };
      const dialogRef = this.dialog.open(AlertaComponent, config);

      // acoes depis que fecha modal
      dialogRef.afterClosed().subscribe(() => this.router.navigateByUrl('filmes'));
    }, () => {
      const config = {
        data: {
          titulo: 'Erro ao Editar o registro ',
          descricao: 'Não Conseguimos Editar seu registro! Favor Tenta Novamente Mais Tarde',
          corBntSucesso: 'wan',
          btnSucesso: 'Fechar',
        } as Alerta
      };
      // mensagens personalizada pra back
      this.dialog.open(AlertaComponent, config);
    });
  }


}
