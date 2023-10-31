package com.devsu.bank.generated.api.models;

import java.util.Objects;
import com.devsu.bank.generated.api.models.Account;
import com.devsu.bank.generated.api.models.Client;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-29T21:23:40.061491300+01:00[Europe/Berlin]")
public class Transaction   {
  @JsonProperty("transaction_id")
  private Integer transactionId;

  @JsonProperty("date")
  private String date;

  @JsonProperty("type")
  private String type;

  @JsonProperty("state")
  private Boolean state;

  @JsonProperty("balance")
  private BigDecimal balance;

  @JsonProperty("balanceTransaction")
  private BigDecimal balanceTransaction;

  @JsonProperty("movement")
  private String movement;

  @JsonProperty("client")
  private Client client;

  @JsonProperty("account")
  private Account account;

  public Transaction transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Transaction type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Transaction state(Boolean state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }

  public Transaction balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Transaction balanceTransaction(BigDecimal balanceTransaction) {
    this.balanceTransaction = balanceTransaction;
    return this;
  }

  /**
   * Get balanceTransaction
   * @return balanceTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getBalanceTransaction() {
    return balanceTransaction;
  }

  public void setBalanceTransaction(BigDecimal balanceTransaction) {
    this.balanceTransaction = balanceTransaction;
  }

  public Transaction movement(String movement) {
    this.movement = movement;
    return this;
  }

  /**
   * Get movement
   * @return movement
  */
  @ApiModelProperty(value = "")


  public String getMovement() {
    return movement;
  }

  public void setMovement(String movement) {
    this.movement = movement;
  }

  public Transaction client(Client client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(value = "")

  @Valid

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Transaction account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.state, transaction.state) &&
        Objects.equals(this.balance, transaction.balance) &&
        Objects.equals(this.balanceTransaction, transaction.balanceTransaction) &&
        Objects.equals(this.movement, transaction.movement) &&
        Objects.equals(this.client, transaction.client) &&
        Objects.equals(this.account, transaction.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, date, type, state, balance, balanceTransaction, movement, client, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceTransaction: ").append(toIndentedString(balanceTransaction)).append("\n");
    sb.append("    movement: ").append(toIndentedString(movement)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

