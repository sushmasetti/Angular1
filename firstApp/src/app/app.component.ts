import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'firstApp';
  // cityName:string="eluru";
  // State:string="AP";
  // PlaceToSee:string;
  // Country:string;
  // rating:number;
  // constructor(){
  //   this.PlaceToSee="QB";
  //   this.Country="India";
  //   this.rating=5;

  constructor(private router:Router){

  }
  

  // OnBtnClick(pCity,pState,pCountry,pPlacesTosee){
  //   this.cityName=pCity;
  //   this.State=pState;
  //   this.Country=pCountry;
  //   this.PlaceToSee=pPlacesTosee;

  // }
  onBtnClick(){
    this.router.navigate([{outlets:{footerOutlet:['about',1001,'sasi']}}]);
  }
}
