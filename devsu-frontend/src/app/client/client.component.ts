import { Component, OnInit } from '@angular/core';

import { ClientService } from '../services/client.service';
import { Client } from './cliente';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {


  clients!: Client[];

  constructor(private clientService: ClientService) { }

  ngOnInit(): void {
    this.fetchAllClients();
  }

  fetchAllClients() {
      this.clientService.getAllClients().subscribe((clients: Client[]) => {
          console.log("client: " + clients);
          this.clients = clients;
      });
      
  }

}
