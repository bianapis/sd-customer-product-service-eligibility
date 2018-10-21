package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProductServiceEligibilityCheckResponse
 */
public class CustomerProductServiceEligibilityCheckResponse   {
  private String customerReference = null;

  private String customerProductServiceEligibilityAssessmentReference = null;

  private String customerProductServiceProfileReference = null;

  private Object customerProductServiceProfile = null;

  private String productServiceType = null;

  private Object customerProductServiceTypeEligibility = null;

  private String customerProductServiceTypeUsage = null;

  private String dateTime = null;

  private String customerProductServiceEligibilityAssessmentResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer Product/Service Eligibility Assessment Reference' 
   * @return customerProductServiceEligibilityAssessmentReference
  **/

  public String getCustomerProductServiceEligibilityAssessmentReference() {
    return customerProductServiceEligibilityAssessmentReference;
  }

  public void setCustomerProductServiceEligibilityAssessmentReference(String customerProductServiceEligibilityAssessmentReference) {
    this.customerProductServiceEligibilityAssessmentReference = customerProductServiceEligibilityAssessmentReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'The product/service for which eligibility is being checked' 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Defines if and under what terms a product/service is available to the customer' 
   * @return customerProductServiceTypeEligibility
  **/

  public Object getCustomerProductServiceTypeEligibility() {
    return customerProductServiceTypeEligibility;
  }

  public void setCustomerProductServiceTypeEligibility(Object customerProductServiceTypeEligibility) {
    this.customerProductServiceTypeEligibility = customerProductServiceTypeEligibility;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'Records the sold/in-force status of a product/service with the customer' 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


  /**
   * Get dateTime
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'The eligibility for requested product/service' 
   * @return customerProductServiceEligibilityAssessmentResult
  **/

  public String getCustomerProductServiceEligibilityAssessmentResult() {
    return customerProductServiceEligibilityAssessmentResult;
  }

  public void setCustomerProductServiceEligibilityAssessmentResult(String customerProductServiceEligibilityAssessmentResult) {
    this.customerProductServiceEligibilityAssessmentResult = customerProductServiceEligibilityAssessmentResult;
  }


}

