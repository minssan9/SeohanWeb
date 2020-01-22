export default class User {
    companyCode='';
    username='';    
    email='';
    asabn='';
    pass='';

    constructor (companyCode, asabn, email, pass) {
      this.companyCode = companyCode;      
      this.username = username;      
      this.email = email;
      this.asabn = asabn;
      this.pass = pass;
    }
  }