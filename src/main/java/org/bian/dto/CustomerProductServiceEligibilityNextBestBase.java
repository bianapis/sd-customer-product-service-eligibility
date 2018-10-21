package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProductServiceEligibilityNextBestBase
 */
public class CustomerProductServiceEligibilityNextBestBase   {
  private String customerReference = null;

  private Object requestedProductServiceProperties = null;

  private String productServiceType = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer Reference' 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'The features used to select the next best product/service' 
   * @return requestedProductServiceProperties
  **/

  public Object getRequestedProductServiceProperties() {
    return requestedProductServiceProperties;
  }

  public void setRequestedProductServiceProperties(Object requestedProductServiceProperties) {
    this.requestedProductServiceProperties = requestedProductServiceProperties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'The type of product/service for which the best eligible product match is requested' 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


}

