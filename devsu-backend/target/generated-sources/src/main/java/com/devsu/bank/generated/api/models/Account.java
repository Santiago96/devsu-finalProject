package com.devsu.bank.generated.api.models;

import java.util.Objects;
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
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-29T21:23:40.061491300+01:00[Europe/Berlin]")
public class Account   {
  @JsonProperty("numberAccount")
  private Integer numberAccount;

  @JsonProperty("balance")
  private BigDecimal balance;

  @JsonProperty("state")
  private Boolean state;

  @JsonProperty("type")
  private String type;

  @JsonProperty("client")
  private Client client;

  public Account numberAccount(Integer numberAccount) {
    this.numberAccount = numberAccount;
    return this;
  }

  /**
   * Get numberAccount
   * @return numberAccount
  */
  @ApiModelProperty(value = "")


  public Integer getNumberAccount() {
    return numberAccount;
  }

  public void setNumberAccount(Integer numberAccount) {
    this.numberAccount = numberAccount;
  }

  public Account balance(BigDecimal balance) {
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

  public Account state(Boolean state) {
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

  public Account type(String type) {
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

  public Account client(Client client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.numberAccount, account.numberAccount) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.state, account.state) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.client, account.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberAccount, balance, state, type, client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    numberAccount: ").append(toIndentedString(numberAccount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

