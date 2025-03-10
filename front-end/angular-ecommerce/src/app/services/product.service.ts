import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private BaseUrl = 'http://localhost:8080/api/products?sizq=100';
  constructor(private httpClient: HttpClient) { }

  getProductList():Observable<Product[]> {
    return this.httpClient.get<GetResponse>(this.BaseUrl).pipe(
      map(response => response._embedded.products)
    );
  }
}

interface GetResponse {
  _embedded: {
    products: Product[];
  }
}