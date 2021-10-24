import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {LayoutModule} from '@angular/cdk/layout';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MAT_DATE_LOCALE} from '@angular/material/core';
import {HttpClientModule} from '@angular/common/http';
import {AppRoutingModule} from './app.routing.module';

import {AppComponent} from './app.component';
import {MaterialModule} from './shared/material/material.module';
import {TopoComponent} from './shared/components/topo/topo.component';

import {RodapeComponent} from './shared/components/rodape/rodape.component';
import {FilmesModule} from './filmes/filmes.module';
import {AlertaComponent} from './shared/components/campos/alerta/alerta.component';


@NgModule({
  declarations: [
    AppComponent,
    TopoComponent,
    RodapeComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    LayoutModule,
    MaterialModule,
    AppRoutingModule,
    FilmesModule
  ],
  entryComponents: [AlertaComponent],
  providers: [{provide: MAT_DATE_LOCALE, useValue: 'pt'}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
