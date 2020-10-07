import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BreedComponent} from './component/breed/breed.component';


const routes: Routes = [
  {path: '', redirectTo: 'breeds', pathMatch: 'full'},
  {path: 'breeds', component: BreedComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
