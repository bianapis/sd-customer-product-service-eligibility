package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProductServiceEligibilityNextBestResponse
 */
public class CustomerProductServiceEligibilityNextBestResponse   {
  private String customerReference = null;

  private String customerProductServiceProfileReference = null;

  private Object customerProductServiceProfile = null;

  private String customerProductServiceNextBestAssessmentReference = null;

  private Object requestedProductServiceProperties = null;

  private String productServiceType = null;

  private String customerProductServiceNextBestAssessmentResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer Product/Service Profile reference' 
   * @return customerProductServiceProfileReference
  **/

  public String getCustomerProductServiceProfileReference() {
    return customerProductServiceProfileReference;
  }

  public void setCustomerProductServiceProfileReference(String customerProductServiceProfileReference) {
    this.customerProductServiceProfileReference = customerProductServiceProfileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'The customer's eligibility profile, including in-force product terms' 
   * @return customerProductServiceProfile
  **/

  public Object getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(Object customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer product/service next best assessment reference' 
   * @return customerProductServiceNextBestAssessmentReference
  **/

  public String getCustomerProductServiceNextBestAssessmentReference() {
    return customerProductServiceNextBestAssessmentReference;
  }

  public void setCustomerProductServiceNextBestAssessmentReference(String customerProductServiceNextBestAssessmentReference) {
    this.customerProductServiceNextBestAssessmentReference = customerProductServiceNextBestAssessmentReference;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator general-info: 'The terms for the selected product/service or a descending list of matched products that is available to the customer' 
   * @return customerProductServiceNextBestAssessmentResult
  **/

  public String getCustomerProductServiceNextBestAssessmentResult() {
    return customerProductServiceNextBestAssessmentResult;
  }

  public void setCustomerProductServiceNextBestAssessmentResult(String customerProductServiceNextBestAssessmentResult) {
    this.customerProductServiceNextBestAssessmentResult = customerProductServiceNextBestAssessmentResult;
  }


}

