import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {Alerta} from '../../../models/alerta';

@Component({
  selector: 'app-alerta',
  templateUrl: './alerta.component.html',
  styleUrls: ['./alerta.component.scss']
})
export class AlertaComponent implements OnInit {
  alert = {
    titulo: 'Sucesso',
    descricao: 'Registro Salvo com Sucesso',
    btnSucesso: 'OK',
    btnCancelar: 'Cancelar',
    corBntSucesso: 'accent',
    corBntCancelar: 'warn',
    possuirBtnFechar: false
  } as Alerta;

  constructor(public dialogRef: MatDialogRef<AlertaComponent>,
              @Inject(MAT_DIALOG_DATA) public data: Alerta) {
  }

  ngOnInit(): void {
    if (this.data) {
      this.alert.titulo = this.data.titulo || this.alert.titulo;
      this.alert.descricao = this.data.descricao || this.alert.descricao;
      this.alert.btnSucesso = this.data.btnSucesso || this.alert.btnSucesso;
      this.alert.btnCancelar = this.data.btnCancelar || this.alert.btnCancelar;
      this.alert.corBntSucesso = this.data.corBntSucesso || this.alert.corBntSucesso;
      this.alert.corBntCancelar = this.data.corBntCancelar || this.alert.corBntCancelar;
      this.alert.possuirBtnFechar = this.data.possuirBtnFechar || this.alert.possuirBtnFechar;
    }
  }

}
