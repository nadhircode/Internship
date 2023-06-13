import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-asset-search',
  templateUrl: './asset-search.component.html',
  styleUrls: ['./asset-search.component.css']
})
export class AssetSearchComponent {
  searchKeyword: string = '';
  searchedAssets: any[] = [];

  constructor(private http: HttpClient) { }

  searchAssets(): void {
    const url = `http://localhost:8080/assets/search?search=${this.searchKeyword}`;
    this.http.get(url)
      .subscribe(
        response => {
          // Handle success response
          this.searchedAssets = response as any[];
        },
        error => {
          // Handle error response
          console.error('Error searching assets:', error);
        }
      );
  }
}
