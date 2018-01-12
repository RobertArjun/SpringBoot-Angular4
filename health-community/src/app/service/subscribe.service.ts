import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import { PatientRegistration } from '../model/patientreg.model';

@Injectable()
export class SubscribeService {
    constructor(private http: Http) {}
    saveSubscrition(patiant: PatientRegistration) {
        return this.http.post('http://localhost:8080/user/patientSuscribe', patiant).map(res => res.json());
    }
}
