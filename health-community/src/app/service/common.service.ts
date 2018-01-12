export class CommonService {
    data: any;
    selectedData: any;
    subscriptionData: any;
    setCommonData(responseDate: any) {
        this.data = responseDate;
    }

    getCommonData() {
        return this.data;
    }

    selectedRowData(row) {
        console.log('inside service' + row.name);
        this.selectedData = row;
    }

    getselectedRowData() {
        return this.selectedData;
    }

    setSubscriptionData(data: any) {
        this.subscriptionData = data ;
    }

    getSubscriptionData() {
        return this.subscriptionData;
    }

}
