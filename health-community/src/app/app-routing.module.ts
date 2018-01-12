import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { PaitentsComponent } from './paitents/paitents.component';
import { RegistrationComponent } from './paitents/registration/registration.component';
const appRoutes: Routes = [
    { path: '', redirectTo: '/login', pathMatch: 'full' },
    { path: 'login', component: LoginComponent, children: [
        { path: '', component: HeaderComponent}
    ]},
    { path: 'patients', component: PaitentsComponent, children: [
      { path: '', component: RegistrationComponent}
  ]},
  ];

@NgModule({
    imports: [RouterModule.forRoot(appRoutes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule {

  }
