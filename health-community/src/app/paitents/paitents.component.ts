import { Component, OnInit, ViewChild, AfterViewInit, Output} from '@angular/core';
import {MatPaginator, MatSort, MatTableDataSource} from '@angular/material';
import { CommonService } from '../service/common.service';
import {RatingModule} from 'ng2-rating';

@Component({
  selector: 'app-paitents',
  templateUrl: './paitents.component.html',
  styleUrls: ['./paitents.component.css']
})
export class PaitentsComponent implements OnInit, AfterViewInit {
  displayedColumns = ['id', 'name', 'phone', 'rating'];
  dataSource: MatTableDataSource<UserData>;
  commonData: any;
  isSubscripe: boolean;
  subscripeDate: any;
  selectedRowIndex: any = -1;
  @Output() outputData: any;
  isRegistered: boolean;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private _commonService: CommonService) {
  }

  ngOnInit() {
    this.commonData = this._commonService.getCommonData();
     const users: UserData[] = [];
     for (let i = 0; i < this.commonData.doctors.length; i++) {
       users.push(createNewUser((i), this.commonData));
    }
     // Assign the data to the data source for the table to render
     this.dataSource = new MatTableDataSource(users);
  }
  /**
   * Set the paginator and sort after the view init since this component will
   * be able to query its view for the initialized paginator and sort.
   */
  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  onEnable(flag: boolean) {
    this.isSubscripe = flag;
    if (this.isSubscripe) {
      this.getSubscriptionData();
    }
  }

  getSubscriptionData() {
    this.subscripeDate = this._commonService.getSubscriptionData();
  }
  selectedRow(row) {
    if ( row != null || row !== undefined) {
      this.selectedRowIndex = row.id;
      console.log('this.selectedRowIndex' + this.selectedRowIndex + 'row' + row.id);
      this.outputData = row;
    this.isRegistered = true;
    }else {this.isRegistered = false; }
  }
  applyFilter(filterValue: string) {
    filterValue = filterValue.trim(); // Remove whitespace
    filterValue = filterValue.toLowerCase(); // Datasource defaults to lowercase matches
    this.dataSource.filter = filterValue;
  }
}

/** Builds and returns a new User. */
function createNewUser(id: number, data: any): UserData {
  const name = data.doctors[id].first_name + ' ' + data.doctors[id].last_name;
  const rowId = id + 1;
  return {
    id: rowId.toString(),
    name: name,
    phone: data.doctors[id].phoneNumber,
    rating: data.doctors[id].rating
  };
}

export interface UserData {
  id: string;
  name: string;
  phone: string;
  rating: string;
}
