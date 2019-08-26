import { Component,EventEmitter, OnInit, Input, Output } from '@angular/core';

@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.css']
})
export class AComponent implements OnInit {
@Input() 
a:string;
@Output()
a1=new EventEmitter();
  constructor() { }

  ngOnInit() {
  }

}
