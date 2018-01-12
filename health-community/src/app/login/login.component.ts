import { Component,
        OnInit,
        ElementRef,
        ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from './user.models';
import { Route} from '@angular/router';
import { Router } from '@angular/router';
import { LoginService } from './login.service';
import { CommonService } from '../service/common.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user= new User();
  constructor(private router: Router,
     private _loginService: LoginService,
     private _commonService: CommonService) {
  }

  ngOnInit() {
  }
  submit() {
   /* if (this.user.userid === 'Robert' && this.user.pwd === 'Robert' ) {
    this.router.navigate(['/patients']);
    }*/
    this._loginService.getAuthentication(this.user)
    .subscribe(data => {
      if (data.user.rollname === 'patient') {
        this.setheResponseFormater(data);
        this.router.navigate(['/patients']);
      }
    });
  }

  setheResponseFormater(data: any) {
    return this._commonService.setCommonData(data);
  }
}
