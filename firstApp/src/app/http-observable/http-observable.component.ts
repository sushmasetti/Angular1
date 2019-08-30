import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-http-observable',
  templateUrl: './http-observable.component.html',
  styleUrls: ['./http-observable.component.css']
})
export class HttpObservableComponent implements OnInit,OnDestroy {

  constructor(public http:HttpClient) { }

  ngOnInit() {
    this.getCall();
  }
  ngOnDestroy(){
    this.subscribedData.unsubscribe();
  }


  public subscribedData:Subscription;
  getCall(){
    this.subscribedData=this.http.get("http://jsonplaceholder.typicode.com/posts").subscribe((data)=>{
      console.log(data);
    });


    // alternative syntax
    // this.http.get("http://jsonplaceholder.typicode.com/posts")
    //           .subscribe((data)=>{},(err=>{});          
  }
}
