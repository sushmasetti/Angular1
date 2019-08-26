import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listen',
  templateUrl: './listen.component.html',
  styleUrls: ['./listen.component.css']
})
export class ListenComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
public speech:string;
public prop:string;
  onSpeak(pTextBox){
    this.speech = pTextBox.value;
  }
}
