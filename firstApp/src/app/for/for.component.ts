import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-for',
  templateUrl: './for.component.html',
  styleUrls: ['./for.component.css']
})
export class ForComponent implements OnInit {


  // public wishlist:string[]=["Iphone","MAc Laptop","Designer Clothing"];
 
  public cPlayers:Player[]=[];
  constructor() { 
    var p1=new Player();
    p1.id=1001;
    p1.name="Dhoni";
    this.cPlayers.push(p1);
    var p2=new Player();
    p2.id=1002;
    p2.name="Sachin";
    this.cPlayers.push(p2);
    var p3=new Player();
    p3.id=1003;
    p3.name="Sehwag";
    this.cPlayers.push(p3);
  }

  ngOnInit() {
    
  }

}

class Player{
  public id:number;
  public name:string;
}