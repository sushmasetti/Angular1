import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';

@Component({
  selector: 'app-movie1',
  templateUrl: './movie1.component.html',
  styleUrls: ['./movie1.component.css']
})
export class Movie1Component implements OnInit {

  public obj:Movie;
  constructor() {
     
     this.obj=new Movie();
     this.obj.hero="Rajini";
     this.obj.mname="Robo";
   }

  ngOnInit() {
  }

}
