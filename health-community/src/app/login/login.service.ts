import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { User } from './user.models';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

@Injectable()
export class LoginService {
    constructor(private http: Http) {}
    getAuthentication(user: User) {

         return this.http.post('http://localhost:8080/user/login', user).map(res => res.json());
    }
}
