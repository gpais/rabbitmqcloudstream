import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { JhiDateUtils } from 'ng-jhipster';

import { Transaction } from './transaction.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class TransactionService {

    private resourceUrl = 'transactions/api/transactions';

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(transaction: Transaction): Observable<Transaction> {
        const copy = this.convert(transaction);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(transaction: Transaction): Observable<Transaction> {
        const copy = this.convert(transaction);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Transaction> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    query(req?: any): Observable<ResponseWrapper> {
        const options = createRequestOption(req);
        return this.http.get(this.resourceUrl, options)
            .map((res: Response) => this.convertResponse(res));
    }

    delete(id: number): Observable<Response> {
        return this.http.delete(`${this.resourceUrl}/${id}`);
    }

    private convertResponse(res: Response): ResponseWrapper {
        const jsonResponse = res.json();
        for (let i = 0; i < jsonResponse.length; i++) {
            this.convertItemFromServer(jsonResponse[i]);
        }
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }

    private convertItemFromServer(entity: any) {
        entity.purchaseDate = this.dateUtils
            .convertDateTimeFromServer(entity.purchaseDate);
    }

    private convert(transaction: Transaction): Transaction {
        const copy: Transaction = Object.assign({}, transaction);

        copy.purchaseDate = this.dateUtils.toDate(transaction.purchaseDate);
        return copy;
    }
}
