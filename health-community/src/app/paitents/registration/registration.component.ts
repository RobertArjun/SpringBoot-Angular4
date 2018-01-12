import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { PatientRegistration } from '../../model/patientreg.model';
import { CommonService } from '../../service/common.service';
import { SubscribeService } from '../../service/subscribe.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
})
export class RegistrationComponent implements OnInit {
  @Output() isEnable = new EventEmitter<boolean>();
  @Input() data: any;
  patient= new PatientRegistration();
  constructor(private _commonServiceData: CommonService, private _subscribeservice: SubscribeService) {
}

  ngOnInit() {
    this.patient.diseas = '0';
  }

  save() {
    this.patient.dname = this.data.name;
    if ( this.patient.dname != null || this.patient.dname !== undefined) {
      this._subscribeservice.saveSubscrition(this.patient)
      .subscribe(
        res => {
          this.setheResponseFormater(res);
          this.isEnable.emit(true);
        }
      );
    }
  }

  setheResponseFormater(data: any) {
    return this._commonServiceData.setSubscriptionData(data);
  }
}
