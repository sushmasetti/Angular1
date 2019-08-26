import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { from } from 'rxjs';
import { FirstComponent } from './first/first.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { IfComponent } from './if/if.component';
import { ForComponent } from './for/for.component';
import { Movie1Component } from './movie1/movie1.component';
import { SwitchComponent } from './switch/switch.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BuiltInPipesComponent } from './built-in-pipes/built-in-pipes.component';
import { ReversePipe } from './reverse.pipe';
import { ValidatePipe } from './validate.pipe';
import { SpeakComponent } from './speak/speak.component';
import { ListenComponent } from './listen/listen.component';
import { AComponent } from './a/a.component';
import { BComponent } from './b/b.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    LoginComponent,
    RegistrationComponent,
    IfComponent,
    ForComponent,
    Movie1Component,
    SwitchComponent,
    NavbarComponent,
    BuiltInPipesComponent,
    ReversePipe,
    ValidatePipe,
    SpeakComponent,
    ListenComponent,
    AComponent,
    BComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
