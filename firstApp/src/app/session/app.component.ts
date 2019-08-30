import { Component } from '@angular/core';
import { BnNgIdleService } from 'bn-ng-idle';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private bnIdle: BnNgIdleService) {
  this.bnIdle.startWatching(300).subscribe((res) => {
    if(res) {
        console.log("session expired");
    }
  })
}
}
