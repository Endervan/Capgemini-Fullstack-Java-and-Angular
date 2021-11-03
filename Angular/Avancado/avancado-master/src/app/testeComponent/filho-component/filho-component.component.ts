import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'jv-filho-component',
  templateUrl: './filho-component.component.html',
  styleUrls: ['./filho-component.component.scss']
})
export class FilhoComponentComponent implements OnInit {

  @Input() receberGrana: number;

  constructor() {
  }

  ngOnInit(): void {
  }

}
