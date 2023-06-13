import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Asset } from 'src/app/asset';

@Injectable({
  providedIn: 'root'
})
export class AssetService {
  // private apiUrl = 'http://localhost:8080/assets/create';

  // constructor(private http: HttpClient) { }

  // registerAsset(asset: Asset): Observable<any> {
  //   return this.http.post<any>(this.apiUrl, asset);
  // }
  private baseUrl = 'http://localhost:8080/assets';
  

  constructor(private http: HttpClient) {}

  registerAsset(assetData: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/create`, assetData);
  }
}
