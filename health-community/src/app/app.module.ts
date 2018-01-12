import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTableModule} from '@angular/material/table';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatCardModule} from '@angular/material/card';
import {MatPaginatorModule} from '@angular/material/paginator';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {MatIconModule} from '@angular/material/icon';
import { RatingModule, Rating } from 'ng2-rating';
import { StarRatingModule } from 'angular-star-rating';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { PaitentsComponent } from './paitents/paitents.component';
import { LoginService } from './login/login.service';
import { CommonService } from './service/common.service';
import { RegistrationComponent } from './paitents/registration/registration.component';
import { SubscriptionComponent } from './paitents/subscription/subscription.component';
import { SubscribeService } from './service/subscribe.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    PaitentsComponent,
    RegistrationComponent,
    SubscriptionComponent,
    Rating
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    StarRatingModule.forRoot(),
    BrowserAnimationsModule,
    MatToolbarModule,
    MatTableModule,
    MatFormFieldModule,
    MatInputModule,
    MatCardModule,
    MatPaginatorModule,
    AppRoutingModule,
    MatIconModule,
  ],
  providers: [LoginService, CommonService, SubscribeService],
  bootstrap: [AppComponent],
})
export class AppModule { }
